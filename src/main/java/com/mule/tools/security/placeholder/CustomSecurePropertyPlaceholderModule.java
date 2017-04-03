package com.mule.tools.security.placeholder;

import org.mule.modules.security.placeholder.SecurePropertyPlaceholderModule;
import org.mule.security.encryption.binary.jce.algorithms.EncryptionAlgorithm;
import org.mule.security.encryption.binary.jce.algorithms.EncryptionMode;

public class CustomSecurePropertyPlaceholderModule extends SecurePropertyPlaceholderModule{
	
	String encryptionAlgorithmVar;
	String encryptionModeVar;

	public String getEncryptionModeVar() {
		return encryptionModeVar;
	}

	public void setEncryptionModeVar(String encryptionModeVar) {
		this.encryptionModeVar = readEnvironmentalProperties(encryptionModeVar);
		this.setEncryptionMode(EncryptionMode.valueOf(this.encryptionModeVar));
	}

	public String getEncryptionAlgorithmVar() {
		return encryptionAlgorithmVar;
	}

	public void setEncryptionAlgorithmVar(String encryptionAlgorithmVar) {
		this.encryptionAlgorithmVar = readEnvironmentalProperties(encryptionAlgorithmVar);
		
		this.setEncryptionAlgorithm(EncryptionAlgorithm.valueOf(this.encryptionAlgorithmVar));
	}
	
	
}
