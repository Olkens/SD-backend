package com.vers.storedash.services

import com.vers.storedash.model.Company
import com.vers.storedash.repositories.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyService(private val repo: CompanyRepository) {
    fun findAllCompanies(): List<Company> = repo.findAll().toList()

    fun getCompany(id: Long): Company = repo.findById(id).orElse(null)
}