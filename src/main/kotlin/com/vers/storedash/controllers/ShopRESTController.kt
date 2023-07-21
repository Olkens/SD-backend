package com.vers.storedash.controllers

import com.vers.storedash.model.Shop
import com.vers.storedash.services.ProductService
import com.vers.storedash.services.ShopService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping("/api/shop")
class ShopRESTController(private val service: ShopService) {

    @GetMapping
    fun getAllShops(): List<Shop> = service.getAllShops()

    @GetMapping("/{id}")
    fun getShop(@PathVariable id: Long): Shop = service.getShop(id)
}