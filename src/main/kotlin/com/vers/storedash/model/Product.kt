package com.vers.storedash.model

import jakarta.persistence.*

@Entity
@Table(name = "product")
data class Product(
    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    val category: List<Category>,
    @Column(nullable = false)
    val price: Float,
    @Column(nullable = true)
    val description: String,
    @Column(nullable = true)
    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    val tags: List<Tag>?
) : BaseEntity()