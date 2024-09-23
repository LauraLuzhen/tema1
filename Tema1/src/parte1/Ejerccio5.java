package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejerccio5 {

	public static void main(String[] args) {
		// Creamos un Scanner
		Scanner lector = new Scanner(System.in);
		// Declaramos variables
		double radio;
		double longitud;
		double area;
		// Le pedimos al usuario un radio
		System.out.println("Dime el radio: ");
		// La consola espera por una respuesta
		radio = lector.nextDouble();
		// Calculamos la longitud y el área
		longitud = 2 * Math.PI * radio;
		area = Math.PI * (radio * radio);
		// Imprimimos por pantalla el resultado
		System.out.println("La longitud es " + longitud + " y el área es " + area + " de la circunferencia.");
		lector.close(); // Cerramos el Scanner
	}

}
