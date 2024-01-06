package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class Ecollection {
	
	public static void main(String[] args) {
		
		ArrayList<EmpCollection> emp = new ArrayList<EmpCollection>();
		
		emp.add(new EmpCollection(2, "Janak", "janakrathod@gmail.com", 100060));
		emp.add(new EmpCollection(83, "Mayank", "Mayank@gmail.com", 100060));
		emp.add(new EmpCollection(34, "Sahil", "Sahil@gmail.com",  100050));
		emp.add(new EmpCollection(55, "Arun", "Arun@gmail.com", 100070));
		emp.add(new EmpCollection(36, "Chirag", "Chirag@gmail.com", 100080));
		emp.add(new EmpCollection(07, "Mon", "Mon@gmail.com", 100090));
		
		Collections.sort(emp);
		
		Iterator<EmpCollection> itr =  emp.iterator();
		while(itr.hasNext())
		{
			EmpCollection e = itr.next();
			
			e.display();
//			System.out.println(e);
		}
	}

}
