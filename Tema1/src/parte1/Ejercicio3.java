package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos un nuevo Scanner
		Scanner lector = new Scanner(System.in);
		
		// Declaramos las variables
		int fechaActual;
		int fechaUsuario;
		int edad;
		
		// Le pedimos al usuario el año actual
		System.out.println("¿En qué año estamos? ");
		
		// La consola espera por una respuesta
		fechaActual = lector.nextInt();
		
		// Le pedimos al usuario su año de nacimiento
		System.out.println("¿Cuál es tu año de nacimiento? ");
		
		// La consola espera una respuesta
		fechaUsuario = lector.nextInt();
		
		// Calculamos la edad del usuario
		edad = fechaActual - fechaUsuario;
		
		// Imprimimos por pantalla la edad del usuario
		System.out.println("Tu edad es: " + edad);
		
		lector.close(); // Cerramos el Scanner
	}

}
