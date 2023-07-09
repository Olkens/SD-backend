package com.vers.storedash.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
@Table(name = "category")
data class Category(
    @Column
    val name: String,
    @Column
    val color: String = "#FFFFFF",
    @ManyToMany
    @JsonIgnore
    @Column(nullable = true)
    var product: List<Product>?
) : BaseEntity()