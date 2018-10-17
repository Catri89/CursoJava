package clase1;

import java.util.Scanner;

//Devuelve los primeros n numeros primos

public class Ejercicios5
{
	public static void main(String[] args)
	{	
		System.out.println("Ingrese numero: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.close();
		int num = 0;

		System.out.println("Resultados");
		for (int i = 0; i < numero; i++){
			
			boolean primo = false;
			while (!primo){
				num++;
				primo = true ;
				int j=num-1;
				while (j>1 && primo)
				{
					primo = !(num%j==0);
					j--;
				}
			}
			System.out.println(num);
			
		}
	}
}
