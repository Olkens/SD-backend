package com.vers.storedash.services

import com.vers.storedash.model.Company
import com.vers.storedash.repositories.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyService(private val companyRepository: CompanyRepository) {
    fun findAllCompanies(): List<Company> = companyRepository.findAll().toList()

}