package org.maxkey.synchronizer.dingding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DingdingSynchronizer {

	public static void main(String[] args) {
	    ConfigurableApplicationContext context = SpringApplication.run(DingdingSynchronizer.class, args);
		  
	}
}
