package com.in28minutes.spring.basics.springin50steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin50steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin50steps.scope.PersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn50stepsApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn50stepsApplication.class);

	public static void main(String[] args) {
		//Create bean
		//Find dependencies bean
		//Where to search for bean
		
		//BinarysearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//BinarysearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		

		//SpringApplication.run(SpringIn50stepsApplication.class, args);
//		ApplicationContext applicationContext = SpringApplication.run(SpringIn50stepsApplication.class, args);
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringIn50stepsApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
//		int result = binarySearch.binarySearch(new int[] { 12,  4, 6 }, 3);
//		System.out.println(result);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConection());
	}
}
