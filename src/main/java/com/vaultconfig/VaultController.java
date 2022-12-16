package com.vaultconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.vault.core.VaultKeyValueOperationsSupport.KeyValueBackend;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaultconfig.config.VaultConfig;

@RestController
public class VaultController {

	@Autowired
	VaultConfig config;
	
	@Autowired
	private VaultTemplate vaultTemplate;
	
	@GetMapping("/loginsecret")
	public String getLogn() {
		return "loginsecret :: "+config.getLogin();
	}
}
