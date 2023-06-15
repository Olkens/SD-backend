package com.vers.storedash.controllers

import com.vers.storedash.model.Category
import com.vers.storedash.services.CategoryService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/category")
class CategoryRESTController(private val service: CategoryService) {

    @PostMapping("/add")
    fun saveCategory(@RequestBody category: Category): Category {
        service.saveCategory(category)
        return category
    }
}