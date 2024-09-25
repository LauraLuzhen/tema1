package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio10 {
	
	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		int num;
		boolean numPar;

		// Le pedimos un número al usuario
		System.out.println("Dime un número: ");

		// Hacemos que la consola espere por una respues
		num = reader.nextInt();

		// Comprobamos si el número es par
		numPar = (num % 2) == 0;

		// Imprimimos por pantalla el resultado
		System.out.println("¿El número " + num + " es par? " + numPar);

		// Cerramos el Scanner
		reader.close();
	}
}
