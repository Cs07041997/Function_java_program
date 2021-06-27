package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class Quadratic {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the num1");
		double num1 = utility.getDouble();
		System.out.println("Enter the num2");
		double num2 = utility.getDouble();
		System.out.println("Enter the num3");
		double num3 = utility.getDouble();
		utility.getQuadratic(num1,num2,num3);
		
		

	}

}
