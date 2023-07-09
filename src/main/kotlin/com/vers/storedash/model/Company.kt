package com.vers.storedash.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name= "company")
data class Company(
    @Column
    val name: String,
    @OneToMany(mappedBy = "company")
    @Column(nullable = true)
    var shop: Collection<Shop>?,
):BaseEntity()
