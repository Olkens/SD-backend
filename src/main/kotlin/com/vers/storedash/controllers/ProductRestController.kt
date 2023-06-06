package com.vers.storedash.controllers

import com.vers.storedash.entities.Product
import com.vers.storedash.services.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class ProductRestController(private val service: ProductService) {

    @GetMapping
    fun message(): Collection<Product> {
        return service.findProducts()
    }

    @PostMapping("/add")
    fun saveProduct(@RequestBody product: Product): Product {
        service.saveProduct(product)
        return product
    }

    @PatchMapping("/{id}")
    fun updateProduct(@PathVariable id: Long, @RequestBody productBody: Product) {
        val updatedProduct = service.updateProduct(id, productBody)
        return updatedProduct
    }
}