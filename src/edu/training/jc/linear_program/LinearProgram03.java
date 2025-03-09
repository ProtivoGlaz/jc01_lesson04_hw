package edu.training.jc.linear_program;

/*Даны координаты трёх вершин прямоугольного треугольника (x1,y1), (x2,y2), (x3,y3).
Найти длины его катетов и гипотенузы.*/
public class LinearProgram03 {

	public static void main(String[] args) {
		double x1 = 1, y1 = 2;
		double x2 = 1, y2 = 8;
		double x3 = 5, y3 = 2;

		double a, b, c;

		a = Math.hypot(x2 - x1, y2 - y1);
		b = Math.hypot(x3 - x1, y3 - y1);
		c = Math.hypot(x3 - x2, y3 - y2);

		double hypot, katet1, katet2;
		
		if (a > b && a > c) {
			hypot = a;
			katet1 = b;
			katet2 = c;
		} else if (b > a && b > c) {
			hypot = b;
			katet1 = a;
			katet2 = c;
		} else {
			hypot = c;
			katet1 = a;
			katet2 = b;
		}

		if (Math.abs(hypot * hypot - (katet1 * katet1 + katet2 * katet2)) < 1e-9) {
			System.out.printf("Катет 1 = %.2f\nКатет 2 = %.2f\nГипотенуза = %.2f\n", katet1, katet2, hypot);
		} else {
			System.out.println("Ошибка: заданные координаты не образуют прямоугольный треугольник.");
		}

	}

}
