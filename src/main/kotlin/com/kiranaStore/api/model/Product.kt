package com.kiranaStore.api.model

import java.math.BigDecimal
import java.util.*

data class Product(
        val id: Int,
        val name: String,
        val description: String,
        val price: Double,
        val status: String) {}