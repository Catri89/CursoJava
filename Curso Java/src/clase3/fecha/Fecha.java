package clase3.fecha;
	
public class Fecha 
{
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int d,int m,int a)
	{
		dia=d;
		mes=m;
		anio=a;
	}

	public Fecha()
	{
	}

	public void addDias(int n)
	{
		int dias = toDias();
		dias = dias+n;
		toFecha(dias);		
	}
	
	private int toDias()
	{
		return anio*360+(mes-1)*30+dia;
	}

	private void toFecha(int dias)
	{
		anio = dias/360;
		int resto = dias%360;
		mes = (resto/30)+1;
		dia = resto%30;
	}

	public String toString()
	{
		return dia+"/"+mes+"/"+anio;
	}

	public int getDia()
	{
		return dia;
	}

	public void setDia(int dia)
	{
		this.dia=dia;
	}

	public int getMes()
	{
		return mes;
	}

	public void setMes(int mes)
	{
		this.mes=mes;
	}

	public int getAnio()
	{
		return anio;
	}

	public void setAnio(int anio)
	{
		this.anio=anio;
	}
	
	
	
}
