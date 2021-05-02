package com.wipro;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student1);
		System.out.println(student2);
	}

}
