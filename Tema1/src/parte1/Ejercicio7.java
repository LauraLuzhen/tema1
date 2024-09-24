package parte1;

import java.util.Scanner; // Importamos el Scanner

public class Ejercicio7 {
	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		String nombre;
		String direccion;
		int numero;

		// Le pedimos al usuario sus datos
		System.out.println("Dime tu nombre: ");
		// La consola espera por una respuesta
		nombre = reader.nextLine();
		System.out.println("Dime tu dirección: ");
		direccion = reader.nextLine();
		System.out.println("Dime tu número de teléfono: ");
		numero = reader.nextInt();

		// Mostramos los resultados por pantalla
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + numero);

		// Cerramos la consola
		reader.close();
	}
}
