package com.vers.storedash.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "tag")
data class Tag(
    @Column(nullable = false)
    var name: String,
    @Column
    var color: String = "#FFFFFF",
    @ManyToMany
    var product: List<Product>?
) :BaseEntity() {
}