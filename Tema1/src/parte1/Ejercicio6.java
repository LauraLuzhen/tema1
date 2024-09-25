package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio6 {
	
	public static void main(String[] args) {

		// Creamos un nuegvo Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		int num1;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		int division;

		// Le pedimos al usuario dos números
		System.out.println("Dime dos números enteros: ");

		// La consola espera por una respuesta
		num1 = reader.nextInt();
		num2 = reader.nextInt();

		// Hacemos los cálculos
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;

		// Imprimimos los resultados por pantalla
		System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
		System.out.println("La resta de " + num1 + " + " + num2 + " = " + resta);
		System.out.println("La multiplicación entre " + num1 + " * " + num2 + " = " + multiplicacion);
		System.out.println("La división entre " + num1 + " / " + num2 + " = " + division);

		// Cerramos la consola
		reader.close();
	}
}
