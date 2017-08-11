package de.oose.ddd.stattauto.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DddStattAutoSrvServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddStattAutoSrvServiceRegistryApplication.class, args);
	}
}
