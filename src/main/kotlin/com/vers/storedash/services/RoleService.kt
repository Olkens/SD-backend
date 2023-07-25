package com.vers.storedash.services

import com.vers.storedash.model.Role
import com.vers.storedash.repositories.RoleRepository
import org.springframework.stereotype.Service

@Service
class RoleService(private val repo: RoleRepository) {
    fun getAllRoles(): List<Role> = repo.findAll().toList()
}