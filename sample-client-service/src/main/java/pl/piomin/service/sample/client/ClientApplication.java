package pl.piomin.service.sample.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
How to run
 	intelliJ : configure profile : ex) zone1
 		run ClientApplication
 	or

	java -jar -Dspring.profiles.active=zone1 ~/idea/spring/mastering-spring-cloud-master/Chapter04/sample-spring-cloud-netflix-cluster/sample-client-service/target/sample-client-service-1.0-SNAPSHOT.jar . &
 	java -jar -Dspring.profiles.active=zone2 ~/idea/spring/mastering-spring-cloud-master/Chapter04/sample-spring-cloud-netflix-cluster/sample-client-service/target/sample-client-service-1.0-SNAPSHOT.jar . &
 	java -jar -Dspring.profiles.active=zone3 ~/idea/spring/mastering-spring-cloud-master/Chapter04/sample-spring-cloud-netflix-cluster/sample-client-service/target/sample-client-service-1.0-SNAPSHOT.jar . &
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
