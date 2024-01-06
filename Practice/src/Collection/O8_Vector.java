package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class O8_Vector {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(4);
		
		Enumeration<Integer> enm = v.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		
	}

}
