package clase3.fecha;

public class FechaHora extends Fecha
{
	private int hora;
	private int minuto;
	private int segundo;

	
	public FechaHora()
	{
	}
	public FechaHora(int d, int m,int a,int hora,int minuto,int segundo)
	{
		super(d,m,a);
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}

	public void f(int a,int b)
	{
		System.out.println(a+","+b);
	}

	
	
	
	
	@Override
	public String toString()
	{
		return super.toString()+" "+hora+":"+minuto+":"+segundo;
	}
	
	public int getHora()
	{
		return hora;
	}
	public void setHora(int hora)
	{
		this.hora=hora;
	}
	public int getMinuto()
	{
		return minuto;
	}
	public void setMinuto(int minuto)
	{
		this.minuto=minuto;
	}
	public int getSegundo()
	{
		return segundo;
	}
	public void setSegundo(int segundo)
	{
		this.segundo=segundo;
	}
	
	
}
