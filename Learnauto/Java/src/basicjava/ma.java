package basicjava;
class Address{
	
	String country,State;
	int hno;
	
	Address(String country,String State,int hno){
		
		this.country=country;
		this.State=State;
		this.hno=hno;
		
		
	}
}
class Heroin{
	
	String hname;
	int hage;
    Address add;
	
	Heroin(String hname,int hage,Address add){
		this.hname=hname;
		this.hage=hage;
		this.add=add;
	}
	
	void display(){
		System.out.println("Henroin Name"+hname);
		System.out.println("Heroin Age"+hage);
		System.out.println("Heroin address"+add.country+""+add.State+""+add.hno);
		
	}
}

public class ma{
	public static void main(String[] args){
		
	
     Address a=new Address("India", "Mubai", 102);
     Heroin h=new Heroin("Anushka", 20, a);
     
     h.display();
	
	}

	}