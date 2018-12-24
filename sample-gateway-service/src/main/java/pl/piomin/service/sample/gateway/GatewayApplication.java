package pl.piomin.service.sample.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * How to run
 *  	intelliJ : configure profile : ex) zone1
 *  		run GatewayApplication
 *
 * 		http://localhost:8765/api/client/ping
 */

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
