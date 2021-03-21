package com.bk.java;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc= new ClassPathXmlApplicationContext("Bean.Xml");
		Broker b= (Broker) apc.getBean("broker");
		b.display();
	}

}
