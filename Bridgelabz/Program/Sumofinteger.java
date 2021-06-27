package com.Bridgelabz.Program;

import com.Bridgelabz.Utility.Utility;

public class Sumofinteger {
	

	public static void main(String[] args) {
		{
			Utility utility = new Utility();
			System.out.println("Enter First Number: ");
		    int Number1 = utility.getIntValue();
			System.out.println("Enter Second Number: ");
			int Number2 = utility.getIntValue();
			System.out.println("Enter Third Number: ");
			int Number3 = utility.getIntValue();
			utility.findTriplets(Number1, Number2, Number3);
		}
	}

	}


