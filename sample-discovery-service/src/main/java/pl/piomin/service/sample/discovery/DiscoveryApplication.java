package pl.piomin.service.sample.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * How to run
 * java -jar -Dspring.profiles.active=peer1 ~/idea/spring/mastering-spring-cloud-master/Chapter04/sample-spring-cloud-netflix-cluster/sample-discovery-service/target/sample-discovery-service-1.0-SNAPSHOT.jar . &
 * java -jar -Dspring.profiles.active=peer2 ~/idea/spring/mastering-spring-cloud-master/Chapter04/sample-spring-cloud-netflix-cluster/sample-discovery-service/target/sample-discovery-service-1.0-SNAPSHOT.jar . &
 * java -jar -Dspring.profiles.active=peer3 ~/idea/spring/mastering-spring-cloud-master/Chapter04/sample-spring-cloud-netflix-cluster/sample-discovery-service/target/sample-discovery-service-1.0-SNAPSHOT.jar . &
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}

}
