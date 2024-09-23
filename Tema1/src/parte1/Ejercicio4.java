package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner lector = new Scanner(System.in);
		// Declaramos las variables
		double nota1;
		double nota2;
		double media;
		// Le pedimos al usuario los dos números
		System.out.println("Dime dos números: ");
		// La consola espera por una respuesta
		nota1 = lector.nextDouble();
		nota2 = lector.nextDouble();
		// Calculamos la media entre los dos números
		media = (nota1 + nota2) / 2;
		// Imprimimos por pantalla la media
		System.out.println("La media entre los dos números dados es: " + media);
		lector.close(); // Cerramos el Scanner
	}

}
