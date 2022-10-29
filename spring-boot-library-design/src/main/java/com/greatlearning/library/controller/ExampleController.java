package com.greatlearning.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;

//@Controller
@RestController
public class ExampleController {

	@GetMapping("/info")
//	@ResponseBody
	public GreatLearning get() {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Testing Get map course name");
		greatLearning.setCourseType("Testing Get map course type");
		greatLearning.setInstuctorName("Testing Get map instuctor name");
		return greatLearning;
	}
}
