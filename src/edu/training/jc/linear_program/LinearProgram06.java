package edu.training.jc.linear_program;

// Найти сумму цифр заданного четырёхзначного числа.
public class LinearProgram06 {

	public static void main(String[] args) {
		int num = 7894;
		int num_copy = num;

		int sum = 0;

		while (num_copy != 0) {

			sum += (num_copy % 10);

			num_copy /= 10;
		}

		System.out.printf("Сумма цифр числа %d равна: %d", num, sum);

	}

}
