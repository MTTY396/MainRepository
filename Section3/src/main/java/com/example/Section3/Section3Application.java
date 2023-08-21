package com.example.Section3;

import com.example.Section3.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Section3Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Section3Application.class, args);
		MyController controller = ctx.getBean(MyController.class);

		System.out.println("I'm main method");
		System.out.println(controller.sayHello());
	}

}
