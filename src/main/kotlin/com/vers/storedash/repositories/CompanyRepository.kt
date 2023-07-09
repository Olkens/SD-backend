package com.vers.storedash.repositories

import org.springframework.data.repository.CrudRepository

interface CompanyRepository : CrudRepository<Company, Long> {
}