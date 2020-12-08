package com.vbi.rest.webservices.vmirestfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbi.rest.webservices.vmirestfulwebservices.Songs.Song;
import com.vbi.rest.webservices.vmirestfulwebservices.Songs.SongResource;

@SpringBootApplication
(scanBasePackages= {"com.vbi.rest.webservices.vmirestfulwebservices"})
public class VmiRestfulWebServicesApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(VmiRestfulWebServicesApplication.class, args);
	}
}
