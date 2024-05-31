package dev.thiago.lb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LBDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LBDemoApplication.class, args);
	}

}
