package com.add.pojo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AddPojo {
	private BigDecimal inputOne;
	private BigDecimal inputTwo;
	private String result;
	public AddPojo(BigDecimal inputOne, BigDecimal inputTwo, String result) {
		super();
		this.inputOne = inputOne;
		this.inputTwo = inputTwo;
		this.result = result;
	}
	public AddPojo() {
		super();
	}
	
}
