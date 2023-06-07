package com.vers.storedash.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Table(name = "product")
data class Product(

    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    @OneToMany
    val category: List<Category>,
    @Column(nullable = false)
    val price: Float,
    @Column(nullable = true)
    val description: String,
    @Column(nullable = true)
    @ManyToMany
    val tags: List<Tag>,
) : BaseEntity()