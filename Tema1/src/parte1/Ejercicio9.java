package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio9 {
	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		int edad;
		boolean mayorEdad;

		// Le preguntamos al usuario por su edad
		System.out.println("Dime cuántos años tienes: ");

		// Hacemos que la consola espere por una respuesta
		edad = reader.nextInt();

		// Calculamos si es mayor de edad
		mayorEdad = edad >= 18;

		// Imprimimos el resultado por pantalla
		System.out.println("¿El usuario es mayor de edad? " + mayorEdad);

		// Cerramos la consola
		reader.close();
	}
}
