package clase2;

import java.util.ArrayList;
import java.util.Scanner;

public class RadixSort
{
	public static void main(String[] args)
	{
		//Crea arraylist de numeros y lo carga
		ArrayList<String> listaOrig = new ArrayList<String>();
		int maxLen = inicio(listaOrig);
		System.out.println("Lista original: " + listaOrig);
		//normaliza longitud de todos los elementos
		normalizaArr(listaOrig, maxLen);
		System.out.println("Lista normalizada: " + listaOrig);
		//ordena 
		ordena(listaOrig, maxLen);
		System.out.println("Lista ordenada: " + listaOrig);
	}
	
	public static void ordena(ArrayList<String> arr, int max)
	{
		ArrayList<ArrayList<String>> listas = new ArrayList<ArrayList<String>>();
		for (int i = max-1; i >= 0; i--)
		{
			inicializaArray(listas);
			int j = i;
			arr.forEach(elm ->{
				listas.get(Character.getNumericValue(elm.charAt(j))).add(elm);
			});
			arr.clear();
			listas.forEach(elm ->{
				elm.forEach(lst ->{
					arr.add(lst);
				});
			});
		}
	}
	
	public static void inicializaArray(ArrayList<ArrayList<String>> listas)
	{
		listas.clear();
		for(int i = 0; i < 10;i++){
			listas.add(new ArrayList<String>());
		}

	}
	
	public static void normalizaArr(ArrayList<String> arr, int max)
	{
		for(int i = 0; i < arr.size(); i++)
		{
			arr.set(i,String.format("%0" + max + "d", Integer.valueOf(arr.get(i))));
			
		}
	}
	
	public static int cargaNumeros(ArrayList<String> arr)
	{
		int numero = 1; 
		System.out.println("Ingrese numeros: ");
		Scanner scanner = new Scanner(System.in);
		int maxLen = 0;
		while (numero > 0)
		{
			numero = scanner.nextInt();
			if(numero>0){
				arr.add(String.valueOf(numero));
				if (String.valueOf(numero).length() > maxLen){maxLen = String.valueOf(numero).length();};
			};
		}
		System.out.println("Ingreso: " + arr);
		scanner.close();
		return maxLen;
	}

	public static int inicio(ArrayList<String> arr)
	{
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar numeros? s/n");
		String resp = new String(scanner.next());
		if (resp.equals("s"))
		{
			max = cargaNumeros(arr);
		}else{
			arr.add("34563");
			arr.add("54");
			arr.add("235");
			arr.add("6795");
			arr.add("54839");
			arr.add("1");
			max = 5;
		}
		scanner.close();
		return max;
	}
}
