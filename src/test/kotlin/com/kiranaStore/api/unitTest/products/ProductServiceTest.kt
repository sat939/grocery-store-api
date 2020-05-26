package com.kiranaStore.api.unitTest.products

import com.kiranaStore.api.entities.ProductEntity
import com.kiranaStore.api.model.Product
import com.kiranaStore.api.products.ProductRepository
import com.kiranaStore.api.products.ProductService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.springframework.boot.test.mock.mockito.MockBean
import java.time.LocalDateTime

class ProductServiceTest {

    @MockBean
    val productRepository: ProductRepository = mock(ProductRepository::class.java)

    private val productService = ProductService(productRepository)

    @Test
    fun `when get products is called then return the list of products`() {
        val productEntityList = listOf(ProductEntity(20, "Apple", "fruit", 3.50,
                150, 1, "available", LocalDateTime.now(), LocalDateTime.now()))
        val expectedProductsList = listOf(Product(20, "Apple", "fruit", 3.50, "available"))

        `when`(productRepository.findAll()).thenReturn(productEntityList)

        val result = productService.getProducts()

        assertEquals(result, expectedProductsList)
    }

    @Test
    fun `when searching for products within a valid category then return the products`(){
        val categoryId = 2
        val product1 = Product(2000, "Apple", "Fruit", 3.50, "available")
        val product2 = Product(2001, "Orange", "Fruit", 1.50, "available")
        val expectedProducts = listOf(product1, product2)
        val entity1 = ProductEntity(2000, "Apple", "Fruit", 3.50, 150, 2, "available",LocalDateTime.now(), LocalDateTime.now())
        val entity2 = ProductEntity(2001, "Orange", "Fruit", 1.50, 50, 2, "available",LocalDateTime.now(), LocalDateTime.now())
        val productEntityList = listOf(entity1, entity2)

        `when`(productRepository.findAll()).thenReturn(productEntityList)

        val result = productService.getProductsByCategory(categoryId)

        assertEquals(result, expectedProducts)
    }

    @Test
    fun `when searching for products with an invalid category then retun emptyList`() {
        val categoryId = 20

        `when`(productRepository.findAllById(listOf(categoryId))).thenReturn(emptyList())

        val result = productService.getProductsByCategory(categoryId)

        assertEquals(result, emptyList<Any>())
    }

    @Test
    fun `when there is an exception with database then throw the run time exception`() {
        val categoryId = 20

        `when`(productRepository.findAllById(listOf(categoryId))).thenThrow(RuntimeException())

        assertThrows<java.lang.RuntimeException>{ productService.getProductsByCategory(categoryId) }

    }
}