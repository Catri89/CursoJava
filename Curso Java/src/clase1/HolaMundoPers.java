package clase1;

import java.util.Scanner;

public class HolaMundoPers
{
	public static void main(String[] args)
	{
		System.out.print("Como te llamas amiguito?");
		Scanner scanner = new Scanner(System.in);
		String nom = scanner.next();
		
		System.out.println("Hola, " + nom);

		scanner.close();
	}
}
