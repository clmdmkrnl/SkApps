package fr.clmdm.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.core.db.DriverManagerConnectionSource;

@Configuration
@PropertySource("classpath:db.properties")
public class MyDataSource extends DriverManagerConnectionSource {	

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String userName;

	@Value("${spring.datasource.password}")
	private String pw;

	@Value("${spring.datasource.driver-class-name}")
	private String driverClass;
	
	public MyDataSource() {
		
		this.setUrl(this.url);
		this.setUser(this.userName);
		this.setPassword(this.pw);
		this.setDriverClass(this.driverClass);
	}

	
}
