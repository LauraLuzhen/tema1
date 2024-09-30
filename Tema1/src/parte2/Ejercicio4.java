package parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		int a;
		int b;
		int c;
		int x;
		int y;
		
		//Le pedimos al usuario
		System.out.println("Dime 3 números: ");
		
		//La consola espera por una respuesta
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		
		//Le pedimos la x
		System.out.println("Dime la incógnita x cuánto vale: ");
		x = reader.nextInt();
		
		//Calculamos y
		y = (a * (x*x)) + (b*x) +c;
		
		//Imprimimos por pantalla el resultado
		System.out.println(y);
		
		//Cerramos el Scanner
		reader.close();
	}
}
