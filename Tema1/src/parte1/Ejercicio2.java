package parte1;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner lector = new Scanner(System.in);

		// Declaramos las variables
		// Variable donde se va a guardar la edad acutal del usuario
		int edad;
		// Variable donde vamos a calcular la edad del próximo año del usuario
		int proxEdad;

		// Le pedimos al usuario que introduzca su edad
		System.out.println("Dime tu edad: ");

		// La consola se queda esperando por una respuesta
		edad = lector.nextInt();

		// Le añadimos un año más a la edad del usuario
		proxEdad = ++edad;

		// Imprimimos por pantalla la edad del próximo año
		System.out.println("Tu edad el año que viene será: " + proxEdad);

		lector.close(); // Cerramos el Scanner
	}

}
