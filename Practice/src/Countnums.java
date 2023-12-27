public class Countnums {

	public static void main(String[] args) {
	
		
		int num = 25477464;
		int count = 0;
		
		while (num > 0)
		{
			int rem = num % 10;
			
			if(rem == 7)
			{
				count++;
			}
			
			num/=10;
		}
		
		System.out.println(count);
		
		
	}
	
}
