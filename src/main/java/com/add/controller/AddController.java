package com.add.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.add.pojo.AddPojo;

@RestController
@RequestMapping(path="/add")
public class AddController {

	@GetMapping(path="/do/{inputOne}/{inputTwo}")
	public AddPojo getAddResult(@PathVariable("inputOne") final BigDecimal inputOne, @PathVariable("inputTwo") final BigDecimal inputTwo) {
		System.out.println("From Path Variable inputOne = "+inputOne+" , inputTwo= "+inputTwo);
		//comment
		
		return new AddPojo(inputOne,inputTwo,"After Addition of "+inputOne+" And "+inputTwo+" , the result is = "+(inputOne.add(inputTwo)));
	}
}
