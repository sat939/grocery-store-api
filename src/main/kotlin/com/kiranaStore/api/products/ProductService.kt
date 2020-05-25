package com.kiranaStore.api.products

import com.kiranaStore.api.model.Product
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ProductService(val productRepository: ProductRepository) {

    fun getProducts(): List<Product> {
        return productRepository.findAll()?.let { entityList ->
            entityList.map { Product(it.id, it.name, it.description, BigDecimal(it.price), it.status) }
        }
    }
}