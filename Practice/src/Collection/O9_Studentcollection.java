package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class O9_Studentcollection {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student1> stu = new ArrayList<Student1>();
		
		stu.add(new Student1(10, "Janak", "janak@gmial.com", 52000));
		stu.add(new Student1(5, "Arun", "arun@gmial.com", 50000));
		stu.add(new Student1(7, "Sahil", "bhalani@gmial.com", 96330));
		stu.add(new Student1(11, "Mayank", "dhaduk@gmial.com", 85632));
		
		Collections.sort(stu,new sortbyName());
		
		Iterator<Student1> itr = stu.iterator();
		while(itr.hasNext())
		{
			Student1 e = itr.next();
			System.out.println(e);
		}
		
		
		
		
		
	}

}
