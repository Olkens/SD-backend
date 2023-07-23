package com.vers.storedash.controllers

import com.vers.storedash.model.Person
import com.vers.storedash.services.PersonService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/person")
@CrossOrigin
class PersonRESTController(private val service: PersonService) {

    @GetMapping
    fun getAllUsers(): List<Person> = service.getAllUsers()

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): Person = service.getUser(id)
}