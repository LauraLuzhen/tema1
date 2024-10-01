package parte2;

import java.util.Scanner; //Importamos el Scanner

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		int milimetros;
		int centimetros;
		int metros;
		int paso1;
		int paso2;
		int suma;

		// Le pedimos al usurio las medidas
		System.out.println("Dime los milímetros: ");

		// La consola espera por una respuesta
		milimetros = reader.nextInt();

		// Repetimos para las otras medidas
		System.out.println("Dime los centímetros: ");
		centimetros = reader.nextInt();
		System.out.println("Dime los metros: ");
		metros = reader.nextInt();

		// Realizamos las operaciones para que la suma de en cm
		paso1 = milimetros / 100;
		paso2 = metros * 100;
		suma = paso1 + paso2 + centimetros;

		// Imprimimos por pantalla
		System.out.println(suma);
		
		// Cerramos el Scanner
		reader.close();
	}
}
