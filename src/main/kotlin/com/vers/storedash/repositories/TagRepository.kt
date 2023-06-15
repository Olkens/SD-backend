package com.vers.storedash.repositories

import com.vers.storedash.model.Tag
import org.springframework.data.repository.CrudRepository

interface TagRepository : CrudRepository<Tag, Long> {
}