package Collection;
class One extends Thread
{
	public void run()
	{
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}
public class Priority {
	public static void main(String[] args) {
		
		One o = new One();
		o.start();
		
	}

}
