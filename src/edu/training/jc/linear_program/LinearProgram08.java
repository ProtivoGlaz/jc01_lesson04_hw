package edu.training.jc.linear_program;

// Дана длина стороны правильного шестигранника. Найти его периметр, площадь и объём правильной призмы на его основе с заданной высотой.
public class LinearProgram08 {

	public static void main(String[] args) {
		double a = 6, h = 12;

		double P, S, Vprism;

		P = a * 6;
		S = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
		Vprism = S * h;

		System.out.printf("Периметр равен: %.2f\nПлощадь равна: %.2f\nОбъём правильной призмы: %.2f\n", P, S, Vprism);
	}

}
