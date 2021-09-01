package com.company;

public class Main {

    public static void main(String[] args) {
	int A = 5;
	int B = 3;
	int C = 9;
	int result = A;

	if (B > result)
        System.out.println("Result is: " + "B = 3");
	if (C > result)
        System.out.println("Result is: " + "C = 9");
	else
        System.out.println(A);

    }
}
