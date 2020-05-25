package com.kiranaStore.api.unitTest.products

import com.kiranaStore.api.entities.ProductEntity
import com.kiranaStore.api.model.Product
import com.kiranaStore.api.products.ProductController
import com.kiranaStore.api.products.ProductRepository
import com.kiranaStore.api.products.ProductService
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.Matchers.hasSize
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import java.math.BigDecimal
import java.time.LocalDateTime

@ExtendWith(SpringExtension::class)
@WebMvcTest(controllers = [ProductController::class])
class ProductTest() {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var productService: ProductService

    @Test
    fun `test the GET products endpoint`() {
        val productList = listOf(Product(20, "Apple", "fruit", BigDecimal(3.50),
                 "available"))

         `when`(productService.getProducts()).thenReturn(productList)

        mockMvc.perform(get("/products"))
                .andExpect(status().isOk)
                .andExpect(jsonPath("$[0].id", equalTo(20)))
    }

}