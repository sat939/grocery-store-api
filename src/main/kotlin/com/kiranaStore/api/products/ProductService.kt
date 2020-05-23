package com.kiranaStore.api.products

import com.kiranaStore.api.model.Product
import org.springframework.stereotype.Service

@Service
class ProductService {
     fun getProducts() : List<Product> {
         return emptyList()
     }
}