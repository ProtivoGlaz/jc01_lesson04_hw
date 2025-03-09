package edu.training.jc.linear_program;

// Вычислить длину дуги и площадь сектора окружности с заданным радиусом R и центральным углом α (в градусах).
public class LinearProgram04 {

	public static void main(String[] args) {

		double R = 6, alpha = 25;
		double sector = alpha / 360;

		double arc_length, sector_area;

		arc_length = (2 * Math.PI * R) * sector;
		sector_area = (Math.PI * Math.pow(R, 2)) * sector;

		System.out.printf("Длина дуги: %.2fсм\n", arc_length);
		System.out.printf("Площадь сектора окружности: %.2fсм2\n", sector_area);
	}

}
