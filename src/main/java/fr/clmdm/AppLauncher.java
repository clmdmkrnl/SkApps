package fr.clmdm;

import java.io.File;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import fr.clmdm.dao.model.DBProperties;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class AppLauncher {

    public static void main(String[] args) {
        SpringApplication.run(AppLauncher.class, args);
        
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
         try {
        	    DBProperties dbP = mapper.readValue(new File(args[0]), DBProperties.class);
         }catch(Exception e) {
        	 
         }
        
        		
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
        };
    }

}