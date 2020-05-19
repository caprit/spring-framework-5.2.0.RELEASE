package com.caprit;

import com.caprit.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Entrance {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		String xmlPath="//Users/caprit/Projects/Java/IntelliJ/GitHub/SpringFramework/5.2.0/spring-framework-5.2.0.RELEASE/springdemo/src/main/resources/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welComeService = (WelcomeService)applicationContext.getBean("welcomeService");
		welComeService.sayHello("强大的Spring框架");
	}

}
