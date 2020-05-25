package com.kiranaStore.api.products

import com.kiranaStore.api.entities.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductEntity, Any>{}