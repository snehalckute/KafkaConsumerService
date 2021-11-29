/**
 * 
 */
package com.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Snehooooo
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {
	
	String id;
	String name;
	String message;

}
