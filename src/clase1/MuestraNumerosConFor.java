package clase1;

import java.util.Scanner;

public class MuestraNumerosConFor
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese desde: ");
		int desde = scanner.nextInt();
		
		System.out.println("Ingrese hasta: ");
		int hasta = scanner.nextInt();
		
		for (int i = desde; i <= hasta; i++)
		{
			System.out.println(i);
		}
		scanner.close();	
		
	}
}