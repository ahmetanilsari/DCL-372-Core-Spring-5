package com.example.imdb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({
	"com.example.imdb.service.business"
})
public class AppConfig {

}
