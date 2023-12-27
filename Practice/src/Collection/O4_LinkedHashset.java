package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class O4_LinkedHashset 
{
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> it = new LinkedHashSet<Integer>();
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		
		Iterator<Integer> in = it.iterator();
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
	}

}
