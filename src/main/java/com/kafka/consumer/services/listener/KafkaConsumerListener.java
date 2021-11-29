/**
 * 
 */
package com.kafka.consumer.services.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.kafka.consumer.dto.CarrierDTO;
import com.kafka.model.MessageDTO;

/**
 * @author Snehooooo
 *
 */
@Service
public class KafkaConsumerListener {
	
	@Autowired
	CarrierDTO carrierDTO;
	
	@KafkaListener(topics="TestTopic", groupId="testGroup")
	public void onMessage(@Payload MessageDTO messageDTO, @Headers MessageHeaders headers, Acknowledgment ack) {
		System.out.println("Message consumed - "+messageDTO+" here are the headers - "+headers);
		carrierDTO.setAck(ack);
		//ack.acknowledge();
	}

}
