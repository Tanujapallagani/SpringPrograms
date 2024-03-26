package com.sathya.lambok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor

@ToString
@AllArgsConstructor
public class Employee {
	private int empId;
	private String empName;
	private double empSalary;

}
