package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Creamos un Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		int segundosUsuario;
		int horas;
		int minutos;
		int segundos;
		
		//Le pedimos al usuario
		System.out.println("Dime los segundos: ");
		
		//La consola espera por una respuesta
		segundosUsuario = reader.nextInt();
		
		//Calculamos las horas, minutos y segundos
		horas = segundosUsuario / 3600;
		minutos = (segundosUsuario % 3600) / 60;
		segundos = (segundosUsuario % 3600) % 60;
		
		//Imprimimos por pantalla
		System.out.println(segundos + " segundos son: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		
		//Cerramos la consola
		reader.close();
	}
}
