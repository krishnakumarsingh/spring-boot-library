package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("Hello");
	}
	@Override
	public void run(String... args) throws Exception {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Testing Course");
		greatLearning.getCourseName();
		System.out.println(greatLearning);
	}
//	@Override
//	public void run(String... args) throws Exception {
////		GreatLearning greatLearning = new GreatLearning();
////		greatLearning.setCourseName("DD");
////		greatLearning.setCourseType("TT");
////		greatLearning.setInstuctorName("LL");
////		System.out.println("greatLearning : " + greatLearning);
//
//		GreatLearning greatLearning = new GreatLearning("PP", "OO", "LL");
//		System.out.println("greatLearning : " + greatLearning);
//	}

}
