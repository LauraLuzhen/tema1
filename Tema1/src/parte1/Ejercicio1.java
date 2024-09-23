package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in); // Creamos un Scanner
		int num; // Declaramos las variables
		System.out.println("Dime un número entero: "); // Le pedimos al usuario por pantalla lo que queremos
		num = lector.nextInt(); // La consola se queda esperando una respuesta
		System.out.println("Tu número es: " + num); // Imprimimos por pantalla el resultado
		lector.close(); // Cerramos el Scanner
	}
}
