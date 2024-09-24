package parte1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declaración de variables
		int pesetas;
		int euros;
		
		//Le pedimos el número de pesetas al usuario
		System.out.println("Dime un número de pesetas: ");
		
		//Hacemos que la consola espere por una respuesta
		pesetas = reader.nextInt();
		
		//Hacemos la conversión
		euros = pesetas / 166;
		
		//Imprimimos el resultado por pantalla
		System.out.println(pesetas + " pesetas son " + euros + " euros");
	}
}
