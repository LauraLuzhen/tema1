package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		//Variable que es el número de entradas infantiles
		int entradasInfantiles;
		//Varibale que es el número de entradas para adultos
		int entradasAdultos;
		// Variable que es el precio de la entrada infantil
		final double INFANTILES = 15.50;
		//Variable que es el precio de la entrada para adultos
		final double ADULTOS = 20;
		//Variable que aplica el descuento
		final double DESCUENTO = 0.05;
		//Variable que suma todos los precios
		double importe;
		//Variable que aplica el descuento si es mayor que 100
		double aplicaDescuento;
		
		//Le pedimos al usuario el núemero de entradas
		System.out.println("Dime el número de entradas infantiles: ");
		entradasInfantiles = reader.nextInt();
		System.out.println("Dime el número de entradas para adulto: ");
		entradasAdultos = reader.nextInt();
		
		//Calculamos
		importe = (entradasAdultos * ADULTOS) + (entradasInfantiles * INFANTILES);
		aplicaDescuento = importe >= 100 ? importe*DESCUENTO : importe;
		
		//Imprimimos por pantalla
		System.out.println(aplicaDescuento);

		//Cerramos el Scanner
		reader.close();
	}
}
