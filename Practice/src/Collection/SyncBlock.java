package Collection;

import java.util.Scanner;

class Account
{
	double balance;
	public Account(double balance)
	{
		this.balance = balance;
	}
	public void Withdraw(double amt)
	{
		if(amt>balance)
		{
			System.out.println("Insufficient balance in Account...");
		}
		else
		{
			balance-=amt;
			System.out.println("Withdrawn successfully...Current Balance : "+balance);
		}
	}
}
class Customer extends Thread
{
	Account a;
	String name;
	public Customer(Account a ,String name)
	{
		this.a = a;
		this.name = name;
	}
	Scanner in = new Scanner(System.in);
	public void run()
	{
		synchronized(a)
		{
			System.out.println("Enter the amout to withdraw : ");
			double amt = in.nextDouble();
			a.Withdraw(amt);
		}
	}
}
public class SyncBlock {
	
	public static void main(String[] args) {
		
		Account a1 = new Account(5000);
		
	Customer c1 = new Customer(a1, "Janak");
	
	c1.start();
		
		
		
		
		
		
		
		
	}

}
