package com.kiranaStore.api.products

import com.kiranaStore.api.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(@Autowired val productService: ProductService) {
    @GetMapping(value = ["/test"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun testApi(): String{
        return "Hello it is working"
    }

    @GetMapping(value = ["/products"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getProducts(): List<Product> {
        return productService.getProducts()
    }
}