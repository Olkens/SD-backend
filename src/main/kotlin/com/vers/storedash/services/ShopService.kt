package com.vers.storedash.services

import com.vers.storedash.model.Shop
import com.vers.storedash.repositories.ShopRepository
import org.springframework.stereotype.Service

@Service
class ShopService(private val repo: ShopRepository) {
    fun getAllShops(): List<Shop> = repo.findAll().toList()

    fun getShop(id: Long): Shop = repo.findById(id).orElse(null)

}