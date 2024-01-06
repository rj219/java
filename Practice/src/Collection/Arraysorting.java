package Collection;

public class Arraysorting {
	
	public static void main(String[] args) {
		
		int a[] = {10,6,4,5,11,24};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					int swap = 0;
					swap = a[i];
					a[i] = a[j];
					a[j] = swap;
				}
				
			}
			System.out.println(a[i]);
		}
		
		
	}

}
