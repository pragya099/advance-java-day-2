
//ability of an object hide teh data and only showing nessesary data;
abstract class Area{
abstract void getArea();

}
//abstract keyword provide enhancebility and reusebility
class Rectangle extends Area{
 
   int l,b;
   Rectangle(int a,int b)
   {
    //this.l=l;
    this.b=b;
  
   }
  // @Override
       
   void getArea(){
      int r=l*b;
    System.out.println("Area of Rectangle:"+r);
   }
   void display(){
    System.out.println("this is ");
   }

}

public class AreaNew
{
    public static void main(String args[])
    {
//Rectangle r=new Rectangle(24,25);
//r.getArea();
//r.display();

//Area r2=new Rectangle(23,34);
//parent class constructor cannotbe called by sup class refrences;
//sub class is not changing refrence of super class
//Area circle = new Area() {
 //   int r=4;
   // @Override
    //void getArea(){
      //  double result=3.14*r*r;
        //System.out.println("area"+result);
    //}
    
//}
  //  }
//}
//we cannot reduce the visibilty
//super class object did not not any information sbout sub class
//anonymous