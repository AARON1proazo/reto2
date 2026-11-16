package reto2;

public class funciones2 {
	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static int dividir(int a, int b) {
		if (b == 0) {
			System.out.println("Error: No se puede dividir entre cero.");
			return 0;
		}
		return a / b;
	}

	public static boolean esPositivo(int n) {
		return n >= 0;
	}

	public static boolean esNegativo(int n) {
		return n < 0;

	}
}
