package com.kiranaStore.api.model

data class Product(
        val id: Int,
        val name: String,
        val description: String,
        val price: Double,
        val status: String) {}