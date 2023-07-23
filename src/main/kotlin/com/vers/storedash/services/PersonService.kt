package com.vers.storedash.services

import com.vers.storedash.model.Person
import com.vers.storedash.repositories.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(private val repo: PersonRepository) {
    fun getAllUsers(): List<Person> = repo.findAll().toList()

    fun getUser(id: Long): Person = repo.findById(id).orElse(null)
}