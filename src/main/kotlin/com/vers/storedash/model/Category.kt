package com.vers.storedash.model

import jakarta.persistence.*

@Entity
@Table(name = "category")
data class Category (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val color: String = "#FFFFFF",
    @ManyToOne
    var procust: Product
)