package com.vers.storedash.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "shop")
data class Shop(
    @Column
    val name: String,
    @OneToMany
    @Column
    val company: Company

):BaseEntity()
