package basicjava;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

	 int a;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the year");
	 a= sc.nextInt();
	    
	    
	    if(a%4==0&&a%100==0)
	    {
	    	System.out.println("leap year");
	    	
	    }
	    else
	    {
	    	System.out.println("Not Leap Year");
	    }
	}

}
