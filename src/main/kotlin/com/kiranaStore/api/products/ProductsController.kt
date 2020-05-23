package com.kiranaStore.api.products

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductsController() {

    @GetMapping(value = ["/test"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getAllProducts(): String{
        return "Hello it is working"
    }
}