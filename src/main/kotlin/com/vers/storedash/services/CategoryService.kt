package com.vers.storedash.services
import com.vers.storedash.model.Category
import com.vers.storedash.repositories.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(private val repo: CategoryRepository) {
    fun saveCategory(category: Category) {
        repo.save(category)
    }
}