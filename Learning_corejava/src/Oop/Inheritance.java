package Oop;

import java.util.Scanner;

class Scanning
{
	int num;
	int num1;

	public void Scan() 
{
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter the value of num : ");
	 	 num = sc.nextInt();
	 	System.out.println("Enter the value of num1 : ");
	 	 num1 = sc.nextInt();
}

}

class A extends Scanning
{
	public void Summation()
	{
		System.out.println("Summation of num and num1 is : " +" "+(num + num1));
	}
}

class B extends A
{
	public void subtraction()
	{
		System.out.println("Subtraction of num and num1 is : " +" "+(num - num1));
	}
}

class C extends B
{
	public void multiplication()
	{
		System.out.println("Multiplication of num and num1 is : " +" "+(num * num1));
	}
}

class D extends C
{
	public void division()
	{
		System.out.println("Division of num and num1 is : " +" "+(num / num1));
	}
}
class E extends D
{
	public void modulo()
	{
		System.out.println("Modulo of the num and num1 is : " + " "+(num % num1));
	}
}

public class Inheritance 
{
	
	public static void main(String[] args) 
	{
		E Calc = new E();
		
		Calc.Scan();
		Calc.Summation();
		Calc.subtraction();
		Calc.multiplication();
		Calc.division();
		Calc.modulo();
		
	}

}

