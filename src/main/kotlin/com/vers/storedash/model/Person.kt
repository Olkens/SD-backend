package com.vers.storedash.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
@Table(name = "Person")
data class Person(
    @Column
    val username: String,
    @Column
    val name: String,
    @Column
    val password: String,
    @Column
    val email: String,
    @Column
    val enabled: Boolean = true,
    @Column
    val activated: Boolean = true,
    @Column
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    val role: Role
):BaseEntity()
