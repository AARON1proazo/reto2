package reto2;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

			do {
				System.out.println("Selecciona el tipo de conversión:");
				System.out.println("1. Longitud");
				System.out.println("2. Peso");
				System.out.println("3. Temperatura");
				System.out.println("4. Volumen");
				System.out.println("0. Salir");

				opcion = funciones.dimeEntero("Opción: ", sc);

				switch (opcion) {
				case 1 -> funciones1.menuLongitud(sc);
				case 2 -> funciones1.menuPeso(sc);
				case 3 -> funciones2.menuTemperatura(sc);
				case 4 -> funciones2.menuVolumen(sc);
				case 0 -> System.out.println("Saliendo del programa...");
				default -> System.out.println("Opción incorrecta. Inténtalo de nuevo.");
				}

			} while (opcion != 0);

			sc.close();
		
	}

}
