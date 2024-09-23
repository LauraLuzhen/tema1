package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio1 {
	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner lector = new Scanner(System.in);
		// Declaramos las variables
		int num;
		// Le pedimos al usuario por pantalla lo que queremos
		System.out.println("Dime un número entero: ");
		// La consola se queda esperando una respuesta
		num = lector.nextInt();
		// Imprimimos por pantalla el resultado
		System.out.println("Tu número es: " + num);
		lector.close(); // Cerramos el Scanner
	}
}
