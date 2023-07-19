package com.vers.storedash.repositories

import com.vers.storedash.model.Company
import org.springframework.data.repository.CrudRepository

interface CompanyRepository : CrudRepository<Company, Long> {
}