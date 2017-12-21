package basicjava;

public class Pattern2 {

	public static void main(String[] args) {
		
		int k=5;
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=k;j>=1;j--)
			{
				System.out.println(" ");
			}
			
			
			for(int x=1;x<=i;i++)
			{
				System.out.print("*");
				
				System.out.print(" ");
			}
			System.out.println(" ");
			k--;
		}


 

	}

}