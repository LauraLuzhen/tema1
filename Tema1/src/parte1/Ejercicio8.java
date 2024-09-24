package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio8 {
	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables
		String nombre;
		int edad;

		// Le pedimos al usuario los datos
		System.out.println("Dime tu nombre: ");
		// Hacemos que la consola espere por una respuesta
		nombre = reader.nextLine();
		System.out.println("Dime tu edad: ");
		edad = reader.nextInt();

		// Imprimimos el resultado por pantalla
		System.out.println("Hola " + nombre + ",tienes " + edad + " años, ¡qué mayor eres!");

		// Cerramos la consola
		reader.close();
	}
}
