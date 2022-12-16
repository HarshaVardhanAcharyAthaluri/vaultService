package com.vaultconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfig {

	@Value("${login}")
	private String login;
	
	@Value("$password")
	private String password;

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}
