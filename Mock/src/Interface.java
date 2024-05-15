interface draw
{
	public void drawable();
}

class circle implements draw
{
	@Override
	public void drawable()
	{
		System.out.println("Draw");
	}
	
}
public class Interface {
	public static void main(String[] args) {
		
		draw d = new circle();
		d.drawable();
	}

}
