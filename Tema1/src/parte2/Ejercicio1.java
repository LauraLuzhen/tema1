package parte2;

import java.util.Scanner; //Importamos el Scanner 

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		double num;
		int redondeo;

		// Le pedimos un número al usuario
		System.out.println("Dime un número con decimales: ");

		// La consola espera por una respuesta
		num = reader.nextDouble();

		// Realizamos las operaciones para que el número del usuario se redondee
		redondeo = num % 1 >= 0.5 ? (int) num + 1 : (int) num;

		// Imprimimos el resultado
		System.out.println(redondeo);

		// Cerramos la consola
		reader.close();
	}
}
