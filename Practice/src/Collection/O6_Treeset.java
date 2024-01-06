package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class O6_Treeset 
{	
		
	public static void main(String[] args) {
		
		TreeSet<String> tr = new TreeSet<String>();
		tr.add("Janak");
		tr.add("Janak");
		tr.add("Titoda");
		tr.add("Mannat");
		
		Iterator<String> str = tr.iterator();
		while(str.hasNext())
		{
			System.out.println(str.next());
		}
		
	}

}
