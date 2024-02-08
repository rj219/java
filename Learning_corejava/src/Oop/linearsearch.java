package Oop;

public class linearsearch {
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,-1};
		int target = -1;
		int ans = (linear(num, target));
		System.out.println(ans);
	}
	
	static int linear(int[] num, int target)
	{
		if (num.length == 0)
		{
			return -1;
		}
		
		for(int index = 0; index<num.length; index++)
		{
			int element = num[index]; 
			if(element == target)
			{
				return index;
			}
		}
		return -1;	
	}

}
