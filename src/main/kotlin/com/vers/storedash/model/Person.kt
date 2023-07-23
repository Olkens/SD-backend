package com.vers.storedash.model

data class Person(
    val username: String,
    val name: String,
    val password: String,
    val email: String,
    val enabled: Boolean = true,
    val activated: Boolean = true
):BaseEntity()
