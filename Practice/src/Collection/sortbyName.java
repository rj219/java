package Collection;

import java.util.Comparator;

public class sortbyName implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2)
	{
		String s1 = o1.name;
		String s2 = o2.name;
		
		return s1.compareTo(s2);
		
		
	}
	
}