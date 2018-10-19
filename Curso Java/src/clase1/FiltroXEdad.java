package clase1;

import java.util.Scanner;

public class FiltroXEdad
{
	public static void main(String[] args)
	{
		
		System.out.println("Ingrese la edad: ");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		
		if (edad < 18)
		{
			System.out.println("No se admiten menores");
		}
		else
		{
			System.out.println("Bienvenido");
		}
		scanner.close();	
		
	}
}
