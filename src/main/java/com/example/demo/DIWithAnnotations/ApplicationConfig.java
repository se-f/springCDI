package com.example.demo.DIWithAnnotations;

import com.example.demo.SetterDI.beans.MyFirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean("myBean")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass();
    }
}
