package clase1;

import java.util.Scanner;

//calcula el factorial del numero ingresado

public class Ejercicios2
{
	public static void main(String[] args)
	{	
		System.out.println("Ingrese numero: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.close();
		int factorial = 1;
		System.out.println("Resultados");
		for (int i = 1; i <= numero; i++){
			factorial *= i;
		}
		System.out.println("factorial de"+numero+" = " + factorial);
	}
}
