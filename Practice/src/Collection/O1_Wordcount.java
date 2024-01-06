package Collection;

import java.util.HashMap;

public class O1_Wordcount {
	
	public static void main(String[] args) 
	{
		
		String s = "Hello janak hello janak";
		
		HashMap<String, Integer> si = new HashMap<String, Integer>();
		
		String word[] = s.split(" ");
		
		for(int i=0; i<word.length; i++)
		{
			if(si.get(word[i])==null)
			{
				si.put(word[i], 1);
			}
			else
			{
				int k = si.get(word[i]);
				k++;
				si.put(word[i], k);
			}
		}
		System.out.println(si);
		
	}

}
