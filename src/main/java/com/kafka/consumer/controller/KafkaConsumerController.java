/**
 * 
 */
package com.kafka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.consumer.dto.CarrierDTO;

/**
 * @author Snehooooo
 *
 */
@RestController
public class KafkaConsumerController {
	
	@Autowired
	CarrierDTO carrierDTO;
	
	@GetMapping(value ="consume")
	String consume() {
		carrierDTO.getAck().acknowledge();
		System.out.println("Consuming");
		return "Success";
	}
	

}
