package basicjava;


class Mark{
	
	int m1,m2,m3;
	Mark(int m1,int m2,int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		}
	
}
public class Student {
	
	String name;
	int id;
	Mark mk;
	Student(String name,int id,Mark mk){
		
		this.id=id;
		this.name=name;
		this.mk=mk;
	}
	
 void dispaly(){
	 System.out.println("Student Name="+name+"StudntId="+id);
	 System.out.println("Student Mark"+mk.m1+mk.m2+mk.m3);
	 
 }

	public static void main(String[] args) {
		Mark m1=new Mark(10, 20, 30);
		Student s=new Student("Mahesh", 101, m1);
		s.dispaly();
	}

}
