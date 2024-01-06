class Rectangle
{
	int length;
	int width;
	void rec(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	void calculate()
	{
		System.out.println("Area of rectangle is "+ length*width);
	}
}
public class Multiple_object {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(),r2 = new Rectangle(),r3 = new Rectangle();
		
		r1.rec(5, 4);
		r2.rec(5, 4);
		
		r1.calculate();
		r2.calculate();
		
	}

}
