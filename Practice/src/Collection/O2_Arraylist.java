package Collection;

import java.util.ArrayList;

public class O2_Arraylist {
	
		public static void main(String[] args) {
			
			ArrayList<String> al = new ArrayList<String>();
			al.add("Java");
			al.add("Python");
			al.add("PHP");
			al.add("Swift");
			al.add(null);
			
			ArrayList<String> sport = new ArrayList<String>(al);
			
			sport.add("Cricket");
			sport.add("Hockey");
			sport.add("khokho");
//			sport.addAll(al);
			
			for(String n : sport)
			{
				System.out.println(n);
			}
			
		}

}
