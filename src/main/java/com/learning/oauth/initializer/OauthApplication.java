package com.learning.oauth.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learning.oauth")
public class OauthApplication {
	/**
	 * Reference of this code can be found in below url:
	 * https://www.callicoder.com/spring-boot-security-oauth2-social-login-part-2/
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(OauthApplication.class, args);
	}

}
