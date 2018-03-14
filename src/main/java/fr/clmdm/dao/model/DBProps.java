package fr.clmdm.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBProps {
	
	private String username;

	private String password;
	
	private String url;
	
	@JsonProperty("driver-class-name")
	private String driverClassName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	
}
