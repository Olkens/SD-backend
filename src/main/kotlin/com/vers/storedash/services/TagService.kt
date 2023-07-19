package com.vers.storedash.services

import com.vers.storedash.model.Product
import com.vers.storedash.model.Tag
import com.vers.storedash.repositories.TagRepository
import org.springframework.stereotype.Service

@Service
class TagService(private val tagRepository: TagRepository, private val productService: ProductService) {
    fun saveNewTag(tag: Tag) {
        tagRepository.save(tag)
    }

    fun findAll() {
        tagRepository.findAll()
    }

    fun findAllTagIdsInProduct(product: Product): List<Tag>? {
        val foundProduct: Product? = product.id?.let { productService.getProductById(it) }
        return foundProduct?.tags
    }
}