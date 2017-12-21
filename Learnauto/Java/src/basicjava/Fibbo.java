package basicjava;

public class Fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=0,n1=1,n2;
		System.out.println(n+" ");
		System.out.print(n1+" ");
		for(i=2;i<=20;i++)
		{
			n2=n1+n;
			System.out.print("" +n2+" ");
			n=n1;
			n1=n2;
		}

	}

}
