package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in); // Creamos un Scanner
		double nota1; // Declaramos las variables
		double nota2;
		double media;
		System.out.println("Dime dos números: "); // Le pedimos al usuario los dos números
		nota1 = lector.nextDouble(); // La consola espera por una respuesta
		nota2 = lector.nextDouble();
		media = (nota1 + nota2) / 2; // Calculamos la media entre los dos números
		System.out.println("La media entre los dos números dados es: " + media); // Imprimimos por pantalla la media
		lector.close(); // Cerramos el Scanner
	}

}
