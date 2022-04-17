package com.miguel.frozenlist.frozenlistvone

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class FrozenListVoneApplication

fun main(args: Array<String>) {
    runApplication<FrozenListVoneApplication>(*args)
}
