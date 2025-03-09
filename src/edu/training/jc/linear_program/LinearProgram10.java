package edu.training.jc.linear_program;

// Известен радиус шара. Найти его объем и площадь поверхности.
public class LinearProgram10 {

	public static void main(String[] args) {
		double r = 5;

		double V, S;

		V = (4 / 3) * Math.PI * Math.pow(r, 3);
		S = 4 * Math.PI * Math.pow(r, 2);

		System.out.printf("Объем шара равен: %.2f\nПлощадь поверхности шара равна: %.2f\n", V, S);
	}

}
