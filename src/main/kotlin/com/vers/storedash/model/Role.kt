package com.vers.storedash.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
@Table(name = "role")
data class Role(
    @Column
    val name: String,
    @Column
    val enabled: Boolean,
    @OneToOne(mappedBy = "role")
    val user: Person
):BaseEntity()
