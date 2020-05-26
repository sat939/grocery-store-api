package com.kiranaStore.api.products

import com.kiranaStore.api.model.Product
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val productService: ProductService) {

    @GetMapping(value = ["/products"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getProducts(): List<Product> {
        return productService.getProducts()
    }

    @PostMapping(value=["/productsByCategory"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getProducts(@RequestBody categoryId : Int) :List<Product> {
        return emptyList()
    }
}