package clase3.fecha;

public class TestFecha
{
	public static void main(String[] args)
	{
		Fecha f1 = new Fecha();
		f1.setDia(2);
		f1.setMes(10);
		f1.setAnio(1990);
		System.out.println( f1 );

		Fecha f2 = new Fecha(3,12,1998);
		System.out.println( f2 );
	
		if( f1.equals(f2) )
		{
			System.out.println("Son iguales !!");
		}
		else
		{
			System.out.println("Son diferentes");			
		}

		FechaHora fh = new FechaHora();
		fh.setDia(6);
		fh.setMes(1);
		fh.setAnio(2011);
		fh.setHora(10);
		fh.setMinuto(30);
		fh.setSegundo(0);
		
		
		
		
		System.out.println(fh);

		
		Fecha x = new FechaHora(4,7,2017,10,30,30);
		System.out.println(x.toString());

		
	}
}
