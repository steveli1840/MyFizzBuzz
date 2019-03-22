package com.sli;

/*
 * @author Steve Li
 * @date 3/22/2019 
*/
public class FizzbuzzApp {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			//System.out.println(fizzBuzz1(i));   //Stage1 
			System.out.println(fizzBuzz2(i));     //Stage2
		}
	}

	/*
	 * Stage1: 
	 * "Fizz" for numbers that are multiples of 3 
	 * "Buzz" for numbers that are multiples of 5 
	 * "FizzBuzz" for numbers that are multiples of both 3 and 5
	 * 
	 */
	public static String fizzBuzz1(Integer num) {
		String outputString = "";
		if (num % 15 == 0) {
			outputString = "FizzBuzz";
		} else if (num % 5 == 0) {
			outputString = "Buzz";
		} else if (num % 3 == 0) {
			outputString = "Fizz";
		} else {
			outputString = num.toString();
		}
		return outputString;
	}

	/*
	 * Stage2 - New requirements 
	 * A number is Fizz if it is divisible by 3 or if it has a 3 in it. 
	 * A number is Buzz if it is divisible by 5 or if it has a 5 in it.
	 * A number is FizzBuzz if it is divisible by 3 or 5 or it has 3 or 5 in it.
	 * 
	 */
	public static String fizzBuzz2(Integer num) {
		String outputString = num.toString();
		if (num % 3 == 0 || num.toString().contains("3")) {
			outputString = "Fizz";
		}
		if (num % 5 == 0 || num.toString().contains("5")) {
			if (outputString.equals("Fizz")) {
				outputString = outputString + " " + "Buzz" + " " + "FizzBuzz";
			} else {
				outputString = "Buzz";
			}
		}
		return outputString;
	}

}
