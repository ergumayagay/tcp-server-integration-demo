package org.emil.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("tcp-config.xml")
public class TcpServerIntegrationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcpServerIntegrationDemoApplication.class, args).start();
	}
}
