package org.maxkey.synchronizer.openldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OpenLdapSynchronizer {

	public static void main(String[] args) {
	    ConfigurableApplicationContext context = SpringApplication.run(OpenLdapSynchronizer.class, args);
		  
	}
}
