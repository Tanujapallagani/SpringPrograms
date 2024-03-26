package com.sathya.lambok;

public class Test {

	public static void main(String[] args) {
		// con
		Employee employee  = new Employee(111,"thanu",2000.45);
		System.out.println(employee);
		
		Employee employee2 = new  Employee();
		employee2.setEmpId(1001);
		employee2.setEmpName("vasu");
		employee2.setEmpSalary(5656.12);
        
		System.out.println(employee2.getEmpId()+" "+ employee2.getEmpName()+" "+ employee2.getEmpSalary());
	}

}
