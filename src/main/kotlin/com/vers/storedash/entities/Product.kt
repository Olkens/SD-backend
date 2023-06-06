package com.vers.storedash.entities

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.annotation.Nullable
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Table(name = "product")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val category: String,
    val price: Float,
    val description: String,
    val tags: String,
    @CreationTimestamp
    val createdAt: Date?,
    @UpdateTimestamp
    val updateAt: Date?,
)