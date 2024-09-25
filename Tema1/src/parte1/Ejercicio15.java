package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		double precio;
		double precioFinal;
		final int IVA = 21;
		
		//Le pedimos al usuario el precio de la compra
		System.out.println("¿Cuánto te ha costado la compra? ");
		
		//Hacemos que la consola espere por una respuesta
		precio = reader.nextDouble();
		
		//Calculamos el precio final con el IVA
		precioFinal = precio + (precio*0.21);
		
		//Imprimimos el resultado por pantalla
		System.out.println("El precio final de la compra junto con el IVA es " + precioFinal + " euros.");
		
		//Cerramos el Scanner
		reader.close();
	}
}
