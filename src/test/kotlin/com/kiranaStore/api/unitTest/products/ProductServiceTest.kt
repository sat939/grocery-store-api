package com.kiranaStore.api.unitTest.products

import com.kiranaStore.api.entities.ProductEntity
import com.kiranaStore.api.model.Product
import com.kiranaStore.api.products.ProductService
import com.kiranaStore.api.products.ProductRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.springframework.boot.test.mock.mockito.MockBean
import java.math.BigDecimal
import java.time.LocalDateTime

class ProductServiceTest {

    @MockBean
    val productRepository: ProductRepository = mock(ProductRepository::class.java)

    private val productService = ProductService(productRepository)

    @Test
    fun `when get products is called then return the list of products`() {
        val productEntityList = listOf(ProductEntity(20, "Apple", "fruit", 3.50,
                150, 1, "available", LocalDateTime.now(), LocalDateTime.now()))
        val expectedProductsList = listOf(Product(20, "Apple", "fruit", BigDecimal(3.50), "available"))

        `when`(productRepository.findAll()).thenReturn(productEntityList)

        val result = productService.getProducts()

        assertEquals(result, expectedProductsList)
    }
}