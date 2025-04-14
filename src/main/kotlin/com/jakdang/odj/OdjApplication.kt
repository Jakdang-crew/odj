package com.jakdang.odj

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OdjApplication

fun main(args: Array<String>) {
    runApplication<OdjApplication>(*args)
}
