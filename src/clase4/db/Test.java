package clase4.db;

import java.util.List;
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String resp = "";
		while (!resp.equals("esc"))
		{
			resp = menu(scanner);
			switch (resp)
			{
				case "1":
					buscarTodos();
					break;
				case "2":
					buscar(scanner.nextInt());
					break;
				case "3":
					break;
				case "4":
					break;
				default:
			}
		}
		scanner.close();
		System.out.println("nosvimo");

		/*
		
		System.out.println("--------");
		
		//dao.update(1,"Muñe","Nuñez 22",1);

		/*
		c = dao.buscar(1);
		System.out.println("Busco el cliente 1 : " + c);
		System.out.println("--------");
		*/
		/*
		dao.insert(8,"Guillermo","La boca 22",1);

		List<Cliente> lst = dao.buscarTodos();
		for (Cliente mati:lst)
		{
			System.out.println("Muestro cliente " + mati);
		}
		System.out.println("--------");
		*/
	}

	public static void buscarTodos()
	{
		ClienteDAO dao = new ClienteDAO();
		//Cliente c = null;
		System.out.println("__");
		List<Cliente> clientes = dao.buscarTodos();
		for (Cliente cli:clientes)
		{
			System.out.println("ID cliente: " + cli.getIdCliente()
							+"\nNombre    : " + cli.getNombre()
							+"\nDireccion : " + cli.getDireccion());
			System.out.println("__");
		}
		System.out.println("--------");
	}

	public static void buscar(int idCliente)
	{
		ClienteDAO dao = new ClienteDAO();
		Cliente c = dao.buscar(idCliente);
		System.out.println("Busco el cliente(" + idCliente + " : " + c);
		System.out.println("--------");
	}
	/*
	*/
	public static String menu(Scanner scanner)
	{
		System.out.println("Menu"
				+ "\n(1)Buscar todos"
				+ "\n(2)Buscar uno"
				+ "\n(3)Update uno"
				+ "\n(4)Insert uno"
				+ "\n(esc) Salir");
		String res = scanner.next();
		return res;
	}
}