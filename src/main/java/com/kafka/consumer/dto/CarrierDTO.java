/**
 * 
 */
package com.kafka.consumer.dto;

import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author Snehooooo
 *
 */
@Data
@Component
public class CarrierDTO {
	
	Acknowledgment ack;

}
