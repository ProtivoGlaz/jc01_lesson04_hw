package edu.training.jc.linear_program;

// Написать программу, которая выводит на экран первые четыре степени числа e (экспоненты).
public class LinearProgram05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.printf("e^%d = %.4f\n", i, Math.pow(Math.E, i));
		}

	}

}
