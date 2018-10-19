package clase1;

import java.util.Scanner;

//Muestra los primeros n numeros pares

public class Ejercicios
{
	public static void main(String[] args)
	{	
		System.out.println("Ingrese numero: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.close();
		int res = 0;
		System.out.println("Resultados");
		for (int i = 0; i < numero; i++){
			if ((res % 2) != 0){
				res++;
			}
			System.out.println(res);
			res++;
		}
	}
}
