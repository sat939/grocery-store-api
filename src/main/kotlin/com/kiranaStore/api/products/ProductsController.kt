package com.kiranaStore.api.productsTest

import com.kiranaStore.api.model.Product
import com.kiranaStore.api.products.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductsController( @Autowired val productService: ProductService) {


    @GetMapping(value = ["/test"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun testApi(): String{
        return "Hello it is working"
    }

    fun getProducts(): List<Product> {
        return productService.getProducts()
    }
}