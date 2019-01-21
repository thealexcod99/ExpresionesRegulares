package pruebas;

import java.util.Scanner;

import teoria.Persona;

public class PruebaColeccionPersonas {

	public static void main(String[] args) {

		//Persona p = new Persona(null, null, null, 0, 0);

		Scanner sc = new Scanner(System.in);

		String nombre, apellido1, apellido2, edad, peso;

		for (int i = 0; i < 5; i++) {


			System.out.println("Introduce el nombre:");
			nombre = sc.next();
			if (!nombre.matches("\\s")) {
				System.out.println("Nombre no válido");
				System.out.println("Introduce el nombre:");
				nombre = sc.nextLine();
			}

			System.out.println("Introduce el primer apellido:");
			apellido1 = sc.next();
			if (!apellido1.matches("\\s")) {
				System.out.println("Apellido no válido");
				System.out.println("Introduce el primer apellido:");
				apellido1 = sc.nextLine();
			}

			System.out.println("Introduce el segundo apellido:");
			apellido2 = sc.next();
			if (!apellido2.matches("\\s")) {
				System.out.println("Apellido no válido");
				System.out.println("Introduce el segundo apellido:");
				apellido2 = sc.nextLine();
			}

			System.out.println("Introduce el peso:");
			peso = sc.next();
			if (!peso.matches("")) {
				System.out.println("Peso no válido");
				System.out.println("Introduce el peso:");
				peso = sc.nextLine();
			}

			System.out.println("Introduce la edad:");
			edad = sc.next();
			if (!edad.matches("^0?[1-9]|^[1-9][\\d]")) {
				System.out.println("Edad no válida");
				System.out.println("Introduce la edad:");
				edad = sc.nextLine();
			}
		}
	}

}
