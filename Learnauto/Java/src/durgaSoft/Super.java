package durgaSoft;
// Super KeyWord is not required
/*class Perent{
	
void m1(int a){
		System.out.println("Parent m1()"+a);}
}

class Super extends Perent {

	void m2(int a){System.out.println("child M1()"+a);}

    void m3(){
	m1(10);
	System.out.println("child2()");
	m2(100);
}
public static void main(String[] args) {

	Super s=new Super();
	s.m3();
	}
}
*/


//Using Super Keyword
/*class Perent{
	
void m1(int a){
		System.out.println("Parent m1()"+a);}
}

class Super extends Perent {

	void m1(int a){System.out.println("child M1()"+a);}

    void m2(){
	this.m1(10);
	System.out.println("child2()");
	super.m1(100);
}
public static void main(String[] args) {

	Super s=new Super();
	s.m2();
	}
}*/

//Super keyword
/*class Perent{
	
Perent(){
System.out.println("Parent 0 Argument Constructor");
}
}
class Super extends Perent {

	Super(){
		this(10);
		System.out.println("child 0 argument cons");
	}
	Super(int a){
		super();
		System.out.println("child 1 arg constru "+a);
	}

public static void main(String[] args) {

	 Super s=new Super();
	 
  }
}*/

//asssing values

/*class Parent{
	int i;
	
	Parent(int i){
		this.i=i;
		}

};
class Super extends Parent{
	boolean x;
	
	Super(boolean x){
		
        super(10);
		this.x=x;
	}
	void display(){
		System.out.println(i);
		System.out.println(x);
	}
	
	
	public static void main(String[] args){
		
		
			Super s=new Super(true);
			s.display();
	}		
		
*/


	
class Parent{
	Parent(){System.out.println("Parent class cons");}
	{System.out.println("Insatant Block");}
	static {System.out.println("Parent Static");}
	
};
class Super extends Parent{
	
	 {System.out.println("child class instance block");}
	Super(){
		super();
		System.out.println("child class 0 argu");
	}
	
	public static void main(String[] args){
		
		
		
	}		
		
}