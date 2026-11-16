package reto2;

import java.util.Scanner;

public class funciones {
	public static int dimeEntero(String texto, Scanner sc) {
		int num = 0;
		boolean valido = false;
		do {
			System.out.print(texto);
			String entrada = sc.nextLine();
			if (entrada.matches("[+-]?\\d+")) {
				num = Integer.parseInt(entrada);
				valido = true;
			} else {
				System.out.println("Error: Debes introducir un número entero válido.");
			}
		} while (!valido);
		return num;
	}

	public static double dimeDouble(String texto, Scanner sc) {
		double num = 0;
		boolean valido = false;
		do {
			System.out.print(texto);
			String entrada = sc.nextLine().replace(",", ".");
			if (entrada.matches("[+-]?\\d+(\\.\\d+)?")) {
				num = Double.parseDouble(entrada);
				valido = true;
			} else {
				System.out.println("Error: Debes introducir un número decimal válido.");
			}
		} while (!valido);
		return num;
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