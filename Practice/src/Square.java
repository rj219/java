import java.util.Scanner;

public class Square {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		
		for(int j=1; j<=n; j++)
        {
             int c = a;
             int v = 1;
            for(int k=1; k<=j; k++)
            {
                c = c +(v*b);
                v*=2;
            }
             System.out.print(c+" ");
        }
        System.out.println();
    }
	
	}

