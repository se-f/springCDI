package com.example.demo.DIWithAnnotations;

import com.example.demo.SetterDI.beans.MyFirstClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);
		MyFirstClass myFirstClass = context.getBean("myBean",MyFirstClass.class);
		System.out.println(myFirstClass.getHello());
	}

	// Instead of using XML, we can use @Bean annotation to define a bean here, or just use @Component annotation
	// in another class definition, or use a configuration class to define beans. (See ApplicationConfig.java)

//	@Bean
	public MyFirstClass myFirstClass() {
		return new MyFirstClass();
	}

}
