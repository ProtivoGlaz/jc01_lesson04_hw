package edu.training.jc.linear_program;



// Вычислить периметр и площадь прямоугольника по заданным длинам его сторон a и b.
public class LinearProgram01 {
	public static void main(String[] args) {
		double a = 10, b = 5;
		double P, S;
		
		P = 2 * (a + b);
		S = a * b;
		
		System.out.printf("Периметр равен: %.2f\nПлощадь равна: %.2f\n", P, S);
	}

}
