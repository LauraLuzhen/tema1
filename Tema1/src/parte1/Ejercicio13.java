package parte1;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declaración de variables
		boolean lluvia;
		boolean tarea;
		boolean biblioteca;
		boolean caso1;
		boolean caso2;
		
		//Le preguntamos al usuario
		System.out.println("¿Está lloviendo? ");
		
		//La consola espera por una respuesta
		lluvia = reader.nextBoolean();
		
		//Hacemos lo mismo con el resto de variables
		System.out.println("¿Has hecho la tarea? ");
		tarea = reader.nextBoolean();
		System.out.println("¿Vas a la biblioteca? ");
		biblioteca = reader.nextBoolean();
		
		//Realizamos las operaciones lógicas
		caso1 = biblioteca && true;
		caso2 = lluvia && tarea;
		
		//Imprimimos por pantalla
		System.out.println("¿Puedes salir a la calle? " + (caso1 || caso2));
		
		//Cerramos la consola
		reader.close();
	}
}
