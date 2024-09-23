package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in); // Creamos un nuevo Scanner
		int fechaActual; // Declaramos las variables
		int fechaUsuario;
		int edad;
		System.out.println("¿En qué año estamos? "); // Le pedimos al usuario el año actual
		fechaActual = lector.nextInt(); // La consola espera por una respuesta
		System.out.println("¿Cuál es tu año de nacimiento? "); // Le pedimos al usuario su año de nacimiento
		fechaUsuario = lector.nextInt(); // La consola espera una respuesta
		edad = fechaActual - fechaUsuario; // Calculamos la edad del usuario
		System.out.println("Tu edad es: " + edad); // Imprimimos por pantalla la edad del usuario
		lector.close(); // Cerramos el Scanner
	}

}
