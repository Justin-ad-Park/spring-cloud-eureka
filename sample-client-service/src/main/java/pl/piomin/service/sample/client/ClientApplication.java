package pl.piomin.service.sample.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
How to run
 	1. intelliJ : configure profile : ex) zone1
 		run ClientApplication

	2. java -jar -DPORT:8081 -Dspring.profiles.active=zone1 sample-client-service-1.0-SNAPSHOT.jar

 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
