package reto2;

import java.util.Scanner;

public class funciones1 {

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}

	public static boolean esPar(int n) {
		return n % 2 == 0;
	}

	public static boolean esImpar(int n) {
		return n % 2 != 0;
	}
	public static void menuLongitud(Scanner sc) {
		int opcion;
		do {
			System.out.println("\nSelecciona la conversión de longitud:");
			System.out.println("1. Millas a Kilómetros");
			System.out.println("2. Kilómetros a Millas");
			System.out.println("0. Salir");
			opcion = funciones.dimeEntero("Opción: ", sc);

			switch (opcion) {
			case 1 -> {
				double millas = funciones.dimeDouble("Introduce las millas: ", sc);
				System.out.printf("%.2f millas son %.2f kilómetros%n", millas, millasAkm(millas));
			}
			case 2 -> {
				double km = funciones.dimeDouble("Introduce los kilómetros: ", sc);
				System.out.printf("%.2f kilómetros son %.2f millas%n", km, kmAmillas(km));
			}
			case 0 -> System.out.println("Volviendo al menú principal...");
			default -> System.out.println("Opción incorrecta.");
			}
		} while (opcion != 0);
	}

	public static double millasAkm(double millas) {
		return millas * 1.60934;
	}

	public static double kmAmillas(double km) {
		return km / 1.60934;
	}
	
	public static void menuPeso(Scanner sc) {
		int opcion;
		do {
			System.out.println("\nSelecciona la conversión de peso:");
			System.out.println("1. Kilogramos a Libras");
			System.out.println("2. Libras a Kilogramos");
			System.out.println("0. Salir");
			opcion = funciones.dimeEntero("Opción: ", sc);

			switch (opcion) {
			case 1 -> {
				double kg = funciones.dimeDouble("Introduce los kilogramos: ", sc);
				System.out.printf("%.2f kg son %.2f libras%n", kg, kgAlibras(kg));
			}
			case 2 -> {
				double libras = funciones.dimeDouble("Introduce las libras: ", sc);
				System.out.printf("%.2f libras son %.2f kg%n", libras, librasAkg(libras));
			}
			case 0 -> System.out.println("Volviendo al menú principal...");
			default -> System.out.println("Opción incorrecta.");
			}
		} while (opcion != 0);
	}

	public static double kgAlibras(double kg) {
		return kg * 2.20462;
}
	public static double librasAkg(double libras) {
		return libras / 2.20462;
	}
	
}
