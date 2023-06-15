package com.vers.storedash.controllers

import com.vers.storedash.model.Product
import com.vers.storedash.services.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping
class ProductRestController(private val service: ProductService) {

    @GetMapping
    @CrossOrigin
    fun products(): Collection<Product> {
        return service.findProducts()
    }

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: Long): Product {
        return service.getProductById(id)
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

    @DeleteMapping("/{id}")
    @ResponseBody
    fun deleteProduct(@PathVariable id: Long) = service.deleteProduct(id)
}