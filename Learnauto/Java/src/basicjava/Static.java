package basicjava;
class test
{
	int a=5;
	static int b=10;
	
	void show()
	{
		
		System.out.println(+a);
		System.out.println(+b);
	}
	
}

public class Static {

	public static void m2(int a,char b,float f)
	{
		
	}
	public static void main(String[] args) {
		
		test t=new test();
		t.show();
		t.a++;
		t.b++;
		t.show();
		
		test t2=new test();
		t2.a++;
		t2.b++;
		t2.show();
		
		

	}
	

}