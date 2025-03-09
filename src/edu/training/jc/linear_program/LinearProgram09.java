package edu.training.jc.linear_program;

// Дана сторона правильного четырёхугольника (квадрата). Найти его площадь, диагональ и радиусы вписанной и описанной окружностей.
public class LinearProgram09 {

	public static void main(String[] args) {
		double a = 4;

		double S, diag, r, R;

		S = a * a;
		diag = Math.hypot(a, a);
		r = a / 2;
		R = diag / 2;
		System.out.printf(
				"Площаль равна: %.2f\nДиагональ равна: %.2f\nРадиус(вписанной окружности) равен: %.2f\nРадиус(описанной окружности) равен: %.2f\n",
				S, diag, r, R);
	}

}
