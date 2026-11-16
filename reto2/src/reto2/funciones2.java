package reto2;

import java.util.Scanner;

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
	public static void menuTemperatura(Scanner sc) {
		int opcion;
		do {
			System.out.println("\nSelecciona la conversión de temperatura:");
			System.out.println("1. Celsius a Fahrenheit");
			System.out.println("2. Fahrenheit a Celsius");
			System.out.println("3. Celsius a Kelvin");
			System.out.println("4. Kelvin a Celsius");
			System.out.println("0. Salir");
			opcion = funciones.dimeEntero("Opción: ", sc);

			switch (opcion) {
			case 1 -> {
				double c = funciones.dimeDouble("Introduce grados Celsius: ", sc);
				System.out.printf("%.2f °C son %.2f °F%n", c, celsiusAfahrenheit(c));
			}
			case 2 -> {
				double f = funciones.dimeDouble("Introduce grados Fahrenheit: ", sc);
				System.out.printf("%.2f °F son %.2f °C%n", f, fahrenheitAcelsius(f));
			}
			case 3 -> {
				double c = funciones.dimeDouble("Introduce grados Celsius: ", sc);
				System.out.printf("%.2f °C son %.2f K%n", c, celsiusAkelvin(c));
			}
			case 4 -> {
				double k = funciones.dimeDouble("Introduce grados Kelvin: ", sc);
				System.out.printf("%.2f K son %.2f °C%n", k, kelvinAcelsius(k));
			}
			case 0 -> System.out.println("Volviendo al menú principal...");
			default -> System.out.println("Opción incorrecta.");
			}
		} while (opcion != 0);
	}
	public static double celsiusAfahrenheit(double c) {
		return (c * 9.0 / 5.0) + 32;
	}
	public static double fahrenheitAcelsius(double f) {
		return (f - 32) * 5.0 / 9.0;
	}
	public static double celsiusAkelvin(double c) {
		return c + 273.15;
	}
	public static double kelvinAcelsius(double k) {
		return k - 273.15;
	}
	public static void menuVolumen(Scanner sc) {
		int opcion;
		do {
			System.out.println("\nSelecciona la conversión de volumen:");
			System.out.println("1. Litros a Galones");
			System.out.println("2. Galones a Litros");
			System.out.println("0. Salir");
			opcion = funciones.dimeEntero("Opción: ", sc);

			switch (opcion) {
			case 1 -> {
				double litros = funciones.dimeDouble("Introduce los litros: ", sc);
				System.out.printf("%.2f litros son %.2f galones%n", litros, litrosAgalones(litros));
			}
			case 2 -> {
				double galones = funciones.dimeDouble("Introduce los galones: ", sc);
				System.out.printf("%.2f galones son %.2f litros%n", galones, galonesAlitros(galones));
			}
			case 0 -> System.out.println("Volviendo al menú principal...");
			default -> System.out.println("Opción incorrecta.");
			}
		} while (opcion != 0);
	}
	public static double litrosAgalones(double litros) {
		return litros * 0.264172;
	}
	public static double galonesAlitros(double galones) {
		return galones / 0.264172;
	}
}
