class Student
{
	int rollnumber;
	String_h name;
	int marks;
}
public class Object_array {
	
	public static void main(String_h args[])
	{
		Student S1 = new Student();
		
		S1.rollnumber = 1;
		S1.name ="Janak";
		S1.marks = 99;
		
		Student S2 = new Student();
		
		S2.rollnumber = 2;
		S2.name ="Abhishek";
		S2.marks = 78;
		
		Student S3 = new Student();
		
		S3.rollnumber = 3;
		S3.name ="Chirag";
		S3.marks = 100;
		
		
		Student Students[] = new Student[3];
		Students[0] = S1;
		Students[1] = S2;
		Students[2] = S3;
		
	for (Student stud : Students)	//for (int i=0; i<Students.length; i++) 
		{
			System.out.println(stud.rollnumber + ":" + stud.name + ":" + stud.marks);
		}
	}

}
