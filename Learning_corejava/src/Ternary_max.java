
public class Ternary_max {
	
	public static void main(String[] args)
	{
		int a = 50;
		int b = 37;
		int c = 34;
		
		
	String	result = (a > b && a > c) ? "A is greater" : (b > c && b > a) ? "B is greater" : "C is greater" ;
	
	System.out.println(result);
	}

}
