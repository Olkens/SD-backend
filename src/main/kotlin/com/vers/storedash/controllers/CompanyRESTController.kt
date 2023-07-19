package com.vers.storedash.controllers

import com.vers.storedash.model.Company
import com.vers.storedash.services.CompanyService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping("/api/company")
class CompanyRESTController(private val service: CompanyService) {

    @GetMapping
    fun getCompanies(): List<Company> = service.findAllCompanies()
}