package clase3.figuras;

public class Rectangulo extends FiguraGeometrica
{
	private int base;
	private int altura;
	
	@Override
	public double area()
	{
		return base*altura;
	}
}
