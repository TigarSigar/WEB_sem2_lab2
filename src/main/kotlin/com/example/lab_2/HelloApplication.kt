package com.example.lab_2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloApplication

fun main(args: Array<String>) {
    runApplication<HelloApplication>(*args)
}
