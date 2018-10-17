package clase1;

import java.util.Scanner;

//Devuelve el numero en la escala fibonacci

public class Ejercicios3
{
	public static void main(String[] args)
	{	
		System.out.println("Ingrese numero: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.close();
		int ant = 1;
		int act = 0;
		System.out.println("Resultados");
		for (int i = 0; i < numero; i++){
			int nue = act + ant;
			ant = act;
			act = nue;
			System.out.print(act+",");
		}
		System.out.println();
		System.out.println(numero + " Fibonacci = " + act);
	}
}
