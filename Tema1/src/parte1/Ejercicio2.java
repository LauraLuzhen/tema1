package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in); // Creamos un Scanner
		int edad; // Declaramos las variables
		int proxEdad;
		System.out.println("Dime tu edad: "); // Le pedimos al usuario que introduzca su edad
		edad = lector.nextInt(); // La consola se queda esperando por una respuesta
		proxEdad = edad + 1; // Le añadimos un año más a la edad del usuario
		System.out.println("Tu edad el año que viene será: " + proxEdad); // Imprimimos por pantalla la edad del próximo
																			// año
		lector.close(); // Cerramos el Scanner
	}

}
