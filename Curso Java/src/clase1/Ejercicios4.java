package clase1;

import java.util.Scanner;

//Devuelve si el numero es primo

public class Ejercicios4
{
	public static void main(String[] args)
	{	
		System.out.println("Ingrese numero: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.close();
		boolean primo = true;
		System.out.println("Resultados");
		int i=numero-1;
		while (i!=1&&primo)
		{
			System.out.println(i);
			primo = !(numero%i==0);
			i--;
		}
		System.out.println(numero + "es primo" + primo);
	}
}
