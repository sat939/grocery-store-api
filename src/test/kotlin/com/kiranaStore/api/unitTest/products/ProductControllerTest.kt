package com.kiranaStore.api.unitTest.products

import com.kiranaStore.api.model.Product
import com.kiranaStore.api.products.ProductController
import com.kiranaStore.api.products.ProductService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class ProductControllerTest {

    private val productService: ProductService = mock(ProductService::class.java)

    private val productsController = ProductController(productService)

    @Test
    fun `when called for products then return list of products`() {
        val expectedProducts = listOf(Product(1000, "Apple", "Fruits", 10.50,"available" ))

        `when`(productService.getProducts()).thenReturn(expectedProducts)

        val result = productsController.getProducts()

        assertEquals(result, expectedProducts)

    }

    @Test
    fun `when failed due to any reason then throw exception`(){

        `when`(productService.getProducts()).thenThrow(RuntimeException("There is an error processing your request"))

       assertThrows<java.lang.RuntimeException> { productsController.getProducts() }
    }

    @Test
    fun `when searching for a specific category then return the products specific to that category`() {
        val categoryId = 2
        val expectedProductsList = listOf(Product(2000, "Carrot", "Vegetables",3.50, "available"))

        `when`(productService.getProductsByCategory()).thenReturn(expectedProductsList)

        val result = productsController.getProducts(categoryId)

        assertEquals(result, expectedProductsList)
    }
}