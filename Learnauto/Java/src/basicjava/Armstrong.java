package basicjava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
	int n,temp,a,c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No");
	n=sc.nextInt();
	
	temp=n;
	
	while(n>0)
	{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		
	}
	if(c==temp)
	{
		System.out.println("No is Arm");
	}
	else
	{
		System.out.println("Not Arm");
	}
	
		
	}
	
	
	
		

	}


