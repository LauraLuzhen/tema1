package parte1;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		double manzanas;
		double peras;
		double importe;
		
		//Le pedimos al usuario los datos
		System.out.println("¿Cuántos kilos de manzanas compras? ");
		
		//La consola espera por una respuesta
		manzanas = reader.nextDouble();
		
		//Hacemos lo mismo con las peras
		System.out.println("¿Cuántos kilos de peras compras? ");
		peras = reader.nextDouble();
		
		//Calculamos el importe total
		importe = (manzanas*2.35) + (peras*1.95);
		
		//Imprimimos por pantalla
		System.out.println("El importe total es de " + importe);
		
		//Cerramos la consola
		reader.close();
	}
}
