package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		int nota1;
		int nota2;
		int nota3;
		double mediaDou;
		int mediaInt;

		// Le pedimos las notas al usuario
		System.out.println("La nota del primer trimestre: ");

		// La consola espera por una respuesta
		nota1 = reader.nextInt();

		// Hacemos lo mismo con el resto de notas
		System.out.println("La nota del segundo trimestre: ");
		nota2 = reader.nextInt();
		System.out.println("La nota del tercer trimestre: ");
		nota3 = reader.nextInt();

		// Calculamos las medias
		mediaDou = (nota1 + nota2 + nota3) / 3;
		mediaInt = (int) mediaDou;

		// Imprimimos por pantalla
		System.out.println("La media en el boletín de calificaciones es: " + mediaInt);
		System.out.println("La media en el expediente académico es: " + mediaDou);

		// Cerramos la consola
		reader.close();
	}
}
