package org.emil.integration;

import org.springframework.stereotype.Component;

@Component
public class EchoService {
	
	public String test(String input) {
		
		System.out.println("Received Message: " + input);
		
		return "echo:" + input;
	}

}
