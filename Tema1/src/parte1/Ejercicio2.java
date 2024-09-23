package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner lector = new Scanner(System.in);
		// Declaramos las variables
		int edad;
		int proxEdad;
		// Le pedimos al usuario que introduzca su edad
		System.out.println("Dime tu edad: ");
		// La consola se queda esperando por una respuesta
		edad = lector.nextInt();
		// Le añadimos un año más a la edad del usuario
		proxEdad = edad + 1;
		// Imprimimos por pantalla la edad del próximo año
		System.out.println("Tu edad el año que viene será: " + proxEdad);
		lector.close(); // Cerramos el Scanner
	}

}
