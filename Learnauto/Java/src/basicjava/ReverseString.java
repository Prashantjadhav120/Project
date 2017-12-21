package basicjava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="welcome to pune";
		
		String revstr="";
		
		int count=str.length();
		
		for(int i=count-1;i>=0;i--)
		{
			
			
			revstr=revstr+str.charAt(i);
		}
		
		System.out.println(revstr);

	}

	

}
