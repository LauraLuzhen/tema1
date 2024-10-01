package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		//Variable que guarda la longitud en metros
		double longitudMetros;
		//Variable que guarda la longitud en centímetros
		int longitudCm;
		//Variable donde vamos a convertir metros a centímetros
		double conversion;
		
		//Le pedimos al usuario el usuario el número de metros
		System.out.println("Dime el número de metros: ");
		longitudMetros = reader.nextDouble();
		
		//Realizamos las operaciones
		conversion = longitudMetros * 100;
		longitudCm = (int) conversion;
		
		//Imprimimos por pantalla el resultado
		System.out.println(longitudCm);
		
		//Cerramos la consola
		reader.close();
	}
}
