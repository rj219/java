package Collection;

import java.util.HashMap;

public class O9_charcount {
	
	public static void main(String[] args) {
		
		String s = "success";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] c = s.toCharArray();
		
		for(int i=0; i<c.length; i++)
		{
			if(map.get(c[i])==null)
			{
				map.put(c[i], 1);
			}
			else
			{
				int k = (map.get(c[i]));
						k++;
						map.put(c[i], k);
			}
		}
		System.out.println(map);		
	}

}
