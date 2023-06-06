package com.vers.storedash.services

import com.vers.storedash.entities.Product
import com.vers.storedash.repositories.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun findProducts(): List<Product> = productRepository.findAll().toList()

    fun saveProduct(product: Product) {
        productRepository.save(product)
    }

    fun updateProduct(id: Long, product: Product) {
        val eProduct = productRepository.findById(id).orElse(null)
        print(eProduct)
        val newProduct = eProduct.copy(
            name = product.name,
            category = product.category,
            price = product.price,
            description = product.description,
            tags = product.tags
        )
        productRepository.save(newProduct)
    }
}