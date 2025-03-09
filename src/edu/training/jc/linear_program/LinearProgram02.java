package edu.training.jc.linear_program;



// Вычислить расстояние между центрами двух окружностей с заданными координатами их центров (x1,y1) и (x2,y2).
public class LinearProgram02 {
	public static void main(String[] args) {
		double x1 = 2, y1 = 5;
		double x2 = 6, y2 = 9;
		
		double result;
		
		result = Math.hypot(x2 -x1, y2 - y1);
		
		System.out.printf("Расстояние между центрами двух окружностей: %.2f\n", result);
	}

}
