package com.lewis.test;

import com.lewis.test.pojo.A;
import com.lewis.test.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @description:
 * @author: lewis
 * @create: 2020-07-08 11:26
 **/

@ComponentScan("com.lewis.test.pojo")
public class MyApplicationTest{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person= (Person) context.getBean("person");
		System.out.println(person.getName());
		A a = (A) context.getBean("beanA");
		System.out.println(a.getB());
	}
}
