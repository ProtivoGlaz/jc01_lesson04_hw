package edu.training.jc.linear_program;

// Даны два числа. Найти среднее арифметическое их квадратов и среднее геометрическое их модулей.
public class LinearProgram07 {

	public static void main(String[] args) {
		double a = 7, b = 5;

		double average_arithmetic, average_geometric;

		average_arithmetic = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
		average_geometric = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.printf("Среднее арифметическое: %.2f\nСреднее геометрическое: %.2f\n", average_arithmetic,
				average_geometric);

	}

}
