package parte1;

import java.util.Scanner; //Importamos el Scanner

public class Ejerccio5 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in); // Creamos un Scanner
		double radio; // Declaramos variables
		double longitud;
		double area;
		System.out.println("Dime el radio: "); // Le pedimos al usuario un radio
		radio = lector.nextDouble(); // La consola espera por una respuesta
		longitud = 2 * Math.PI * radio; // Calculamos la longitud y el área
		area = Math.PI * (radio * radio);
		System.out.println("La longitud es " + longitud + " y el área es " + area + " de la circunferencia."); // Imprimimos
																												// por
																												// pantalla
																												// el
																												// resultado
		lector.close(); // Cerramos el Scanner
	}

}
