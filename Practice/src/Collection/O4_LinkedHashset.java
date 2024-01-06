package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class O4_LinkedHashset 
{
	public static void main(String[] args) {
		
		HashSet<Integer> it = new HashSet<Integer>();
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		it.add(20);
		
		Iterator<Integer> in = it.iterator();
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
	}

}
