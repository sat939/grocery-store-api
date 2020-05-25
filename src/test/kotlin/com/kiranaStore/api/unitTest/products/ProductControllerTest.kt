package com.kiranaStore.api.unitTest.products

import com.kiranaStore.api.model.Product
import com.kiranaStore.api.products.ProductController
import com.kiranaStore.api.products.ProductService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import java.math.BigDecimal

class ProductControllerTest {

    val productService = mock(ProductService::class.java)

    val productsController = ProductController(productService)

    @Test
    fun `when called testApi return the string`(){
        //Arrange
        val expectedString = "Hello it is working"
        //Act
        val result = productsController.testApi()

        //Assert
        assertEquals(result, expectedString)
    }

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
}