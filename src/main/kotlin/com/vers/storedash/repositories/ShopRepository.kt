package com.vers.storedash.repositories

import com.vers.storedash.model.Shop
import org.springframework.data.repository.CrudRepository

interface ShopRepository : CrudRepository<Shop, Long> {
}