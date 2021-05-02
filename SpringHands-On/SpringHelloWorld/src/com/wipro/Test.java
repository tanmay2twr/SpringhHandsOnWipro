package com.wipro;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.display();
	}

}
