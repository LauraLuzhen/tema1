package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		int entradasInfantiles;
		int entradasAdultos;
		final double INFANTILES = 15.50;
		final double ADULTOS = 20;
		final double DESCUENTO = 0.05;
		double importe;
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
