package io.github.ali4j.springbootcloudconfigcliet.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootcloudconfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcloudconfigclientApplication.class, args);
	}

}
