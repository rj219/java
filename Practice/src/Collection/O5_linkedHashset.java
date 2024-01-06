package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class O5_linkedHashset {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> it = new LinkedHashSet<Integer>();
		it.add(1);
		it.add(2);
		it.add(3);
		it.add(4);
		it.add(2);
		
		Iterator<Integer> itr = it.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
