package parte1;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variables que va a contener el número entero del usuario
		int num;

		// Pedimos un número al usuario
		System.out.println("Dime un número entero: ");

		// La consola espera por una respuesta del usuario
		num = reader.nextInt();

		// Imprimimos por pantalla el número que ha introducido el usuario
		System.out.println("Tu número es: " + num);

		// Cerramos el Scanner
		reader.close();
	}
}
