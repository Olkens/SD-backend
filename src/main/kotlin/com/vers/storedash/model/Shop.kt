package com.vers.storedash.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "shop")
data class Shop(
    @Column
    val name: String,
    @ManyToOne
    @JoinColumn(name="company_id", nullable=false)
    val company: Company,
    @OneToMany(mappedBy = "shop")
    val product: List<Product>?,

):BaseEntity()
