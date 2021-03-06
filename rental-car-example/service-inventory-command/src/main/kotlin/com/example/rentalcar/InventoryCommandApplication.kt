package com.example.rentalcar

import com.example.rentalcar.inventory.InventoryProcessor
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding

@SpringBootApplication
@EnableBinding(InventoryProcessor::class)
class InventoryCommandApplication

fun main(args: Array<String>) {
	runApplication<InventoryCommandApplication>(*args)
}
