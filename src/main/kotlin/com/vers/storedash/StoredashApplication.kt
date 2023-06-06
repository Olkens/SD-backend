package com.vers.storedash

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories("com.vers.storedash.*")
@SpringBootApplication
class StoredashApplication

fun main(args: Array<String>) {
	runApplication<StoredashApplication>(*args)
}
