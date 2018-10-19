package clase1;

import java.util.Scanner;

public class MuestraNumeros
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese desde: ");
		int desde = scanner.nextInt();
		
		System.out.println("Ingrese hasta: ");
		int hasta = scanner.nextInt();

		int i = desde;
		while (i<=hasta)
		{
			System.out.println(i);
			i = i+1;
		}
		scanner.close();	
		
	}
}