package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class Wind_chill {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the num1");
	       double num1 = utility.getDouble();
	       System.out.println("Enter the num2");
	       double num2 = utility.getDouble();
	       utility.getwindchill(num1,num2);
		
	}
	

}

	
