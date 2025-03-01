package oop;

public class recursion {
	public static int sumOfDigits(int n) {
		if(n==0) 
			return 0;
		int lastDigit =n%10;
		return lastDigit + sumOfDigits(n/10);
		
	}

	public static void main(String[] args) {
		int n=1234;
		System.out.println(sumOfDigits(n));

	}

}
