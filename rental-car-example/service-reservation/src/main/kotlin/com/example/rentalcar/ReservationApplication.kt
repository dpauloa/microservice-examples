package com.example.rentalcar

import com.example.rentalcar.reservation.ReservationProcessor
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ReservationProcessor::class)
class ReservationApplication

fun main(args: Array<String>) {
	runApplication<ReservationApplication>(*args)
}
