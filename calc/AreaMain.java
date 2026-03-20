class Area{
    int r,l,base;
    Area(String msg){    
System.out.println(msg);
    }
    
    
    void getArea(){
        System.out.println("THis is a area class");
    }
}
class Circle extends Area{
    final double PI=3.14;
    Circle(int r){
       // super.r=r;
       super("this is area constructor");
      this.r=r;
    }
    void getCircleArea()
    {
        //serialization and dserialization



        double result=PI*r*r;
        //double result=PI*super.r*this.r; whye we use super and this keyword
        //double result=PI*super.r*super.r;  for  this by the law of inheritence but condition apply
        // until u define the same variable it is fundamental error no need to this.
        //super classs constructor always  implicitly call by sub class constructor (for initializing object of super and sub class)
        //checks its own class first then go super class 
        System.out.println("Area of Circle="+result);
    }

}     //all the member of super class is by default the member of sub class;(resuability of code)


public class AreaMain
{
    public static void main(String args[])
    {
  //      Circle cr=new Circle(10);
    //    cr.getArea();
      //  cr.getCircleArea();

        Area a=new Circle(34);//cons is from sub class
        a.getArea();
        Circle c=(Circle) new Area("abc"); //down casting up casting
        // ho jati lakin function call nhi hota.
        
           //func of superclass
          //c.getarea();
         //c.getCircleArea();   
        //types of pointer
       //it cant be opposite , we cant do this  . reason 
    }
}
//abstract class provide partial implementtation
//diff between abstract and implement
//agar java m new keyword nhi define kiya gya h refrence memory share hogi ,
//when we want to access any class without wn object 

//final ka matlb h over ride hoga
//jab hmm uske object ko same memory share krana  chahte h or ek object m change kre vo sb m reflect ho tb static key word ka use krte h 
//jab bhi class ka constructor call hoga tab bhi 
//object bnega default value 0
