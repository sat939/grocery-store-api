package com.kiranaStore.api.entities

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "product")
data class ProductEntity(

    @Id
    @GeneratedValue
    @Column(name = "id")
    val id: UUID,

    @Column
    val name: String,

    @Column
    val description: String,

    @Column
    val price: Float,

    @Column
    val quantity: Int,

    @Column
    val category_id: UUID,

    @Column
    val status: String,

    @Column
    val created_timestamp: LocalDateTime,

    @Column
    val modified_timestamp: LocalDateTime

){}