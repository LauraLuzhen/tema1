package parte2;

import java.util.Scanner;	//Importamos el Scanner

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declaración de variables
		int num;
		int diferencia;
		int numRedondeo;
		
		//Le pedimos un número al usuario
		System.out.println("Dime un número entero: ");
		
		//La consola espera por una respuesta
		num = reader.nextInt();
		
		//Realizamos las operaciones
		diferencia = 7 - (num%7);
		numRedondeo = diferencia == 7 ? 0 : diferencia;
		
		
		//Imprimimos por pantalla el resultado
		System.out.println(numRedondeo);
		
		//Cerramos la consola
		reader.close();
	}
}
