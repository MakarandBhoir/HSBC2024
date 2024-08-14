package com.hsbc.client;

import com.hsbc.calcy.Calculator;
import com.hsbc.calcy.CalculatorImpl;
//import com.hsbc.utility.MathUtils;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new CalculatorImpl();
		System.out.println(calc.add(10, 20));
		
	}

}
