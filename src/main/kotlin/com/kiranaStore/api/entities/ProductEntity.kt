package com.kiranaStore.api.entities

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "product")
data class ProductEntity(

        @Id
    @GeneratedValue
    @Column(name = "id")
        val id: Int,

        @Column
        val name: String,

        @Column
        val description: String,

        @Column
        val price: Double,

        @Column
        val quantity: Int,

        @Column
        val category_id: Int,

        @Column
        val status: String,

        @Column
        val created_timestamp: LocalDateTime,

        @Column
        val modified_timestamp: LocalDateTime

){}