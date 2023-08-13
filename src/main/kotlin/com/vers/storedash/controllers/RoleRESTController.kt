package com.vers.storedash.controllers

import com.vers.storedash.model.Role
import com.vers.storedash.services.RoleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/role")
class RoleRESTController(private val service: RoleService) {

    @GetMapping
    fun getAll(): List<Role> = service.getAllRoles()
}