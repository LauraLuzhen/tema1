package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declaración de variables
		int num1;
		int num2;
		int diferencia;
		int numRedondeo;
		
		//Le pedimos al usuario dos números
		System.out.println("Dime un número entero: ");
		
		//La consola espera por una respuesta
		num1 = reader.nextInt();
		
		//Repetimos para pedir el segundo núemro
		System.out.println("Dime otro número: ");
		num2 = reader.nextInt();
		
		//Realizamos las operaciones
		diferencia = num2 - (num1%num2);
		numRedondeo = diferencia == num2 ? 0 : diferencia;
		
		//Imprimimos el resultado
		System.out.println(num1);
		
		//Cerramos la consola
		reader.close();
	}
}
