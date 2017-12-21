package basicjava;

class pattern
{


int k=5;

  public void Prime()
 {
 
  for(int x=1;x<=5;x++)
 {

  for(int i=k;i>=1;i--)
 {
   
  System.out.print(" ");

 }

    for(int j=1;j<=x;j++)
 {
   System.out.print(j);
   System.out.print(" ");
 }  ///inner for end
  System.out.println();
 k--; 

}
 }


 public static void main(String[] args)
{

 pattern fr=new pattern();
 fr.Prime();


}
}