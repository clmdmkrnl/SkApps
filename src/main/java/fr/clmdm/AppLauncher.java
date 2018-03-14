package fr.clmdm;

import java.io.File;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.clmdm.dao.model.DB;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class AppLauncher {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppLauncher.class);	
	
	public static void main(String[] args) {
		SpringApplication.run(AppLauncher.class, args);

		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			
			File yaml = new File(args[0]);
			
			DB dbP = mapper.readValue(yaml, DB.class);
			LOGGER.debug(ReflectionToStringBuilder.toString(dbP.getDb(), ToStringStyle.MULTI_LINE_STYLE));
		} catch (Exception e) {
			LOGGER.error("Test",e);
		}

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
		};
	}

}