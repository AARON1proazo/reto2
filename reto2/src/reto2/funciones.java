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

	

	
}