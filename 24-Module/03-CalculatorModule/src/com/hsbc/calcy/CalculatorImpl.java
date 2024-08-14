package com.hsbc.calcy;

import com.hsbc.utility.MathUtils;

public class CalculatorImpl implements Calculator {
	public int add(int a, int b) {
		return MathUtils.add(a, b);
	}

	public int multiply(int a, int b) {
		return MathUtils.multiply(a, b);
	}
}
