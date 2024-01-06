package Collection;
class Th1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Th1 "+ i);
		}
	}
}
class Th2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Th2 "+i);
		}
	}
}
public class O9_Thread {
	
	public static void main(String[] args) 
	{
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
		t1.start();
		t2.start();
		
	}

}
