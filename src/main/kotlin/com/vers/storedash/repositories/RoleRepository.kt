package com.vers.storedash.repositories

import com.vers.storedash.model.Role
import org.springframework.data.repository.CrudRepository

interface RoleRepository : CrudRepository<Role, Long> {
}