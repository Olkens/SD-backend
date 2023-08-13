package com.vers.storedash.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.io.Serializable
import java.util.*

@MappedSuperclass
open class BaseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @CreationTimestamp
    @Column(nullable = true)
    var dateCreated: Date? = Date(),

    @UpdateTimestamp
    @Column(nullable = true)
    var lastUpdated: Date? = Date()
) : Serializable {

    @PrePersist
    protected fun prePersist() {
        if (this.dateCreated == null) this.dateCreated = Date()
        if (this.lastUpdated == null) this.lastUpdated = Date()
    }

    @PreUpdate
    protected fun preUpdate() {
        this.lastUpdated = Date()
    }

}