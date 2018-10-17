package clase3.figuras;

public abstract class FiguraGeometrica
{
	public abstract double area();
	
	@Override
	public String toString()
	{
		return "Mi area es: "+area();
	}
}
