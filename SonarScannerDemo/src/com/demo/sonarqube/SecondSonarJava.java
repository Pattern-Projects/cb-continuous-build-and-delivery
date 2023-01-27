package com.demo.sonarqube;

public class SecondSonarJava {

	public static void main(String[] args) {
		System.out.println(getWords(2));
		System.out.println(sumOfPrimes(15));

	}

	static String getWords(int number) {
		switch (number) {
		case 1:
			return "one";
		case 2:
			return "two";
		default:
			return "lots";
		}
	}

	static int sumOfPrimes(int max) {
		int total = 0;
		OUT: for (int i = 2; i <= max; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue OUT;
				}
			}
			total += i;
		}
		return total;
	}

}
