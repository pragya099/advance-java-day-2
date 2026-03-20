//package calc;

/* two constructor in java called constructor overloading*/
class Sum{  //template or blueprint of object 
    int num1,num2;
    Sum()
    {  //user defined default constructor
//sum(10,10);//constructor call within constructor is not allowed in java  but we can call using this keyword.
this(10,10); //this keyword is used to call another constructor of same class
//constructor call within constructor is called constructor chaining
    }
    Sum(int num1,int num2)
    { //intance variable name should be same as local varriable name.
        this.num1=num1; //this refrences class variable wnhich means 
        this.num2=num2; //local variable num1 , num2 within the constructor
    }
    void getSum()
    {
        System.out.println("sum="+(num1+num2));
    }
}
class Multi
{
    void getMulti(int num1,int num2)
    {
        System.out.println("multiplication="+num1*num2);
    }
}
 public class Calculator{
    public static void main(String[] args)
    {
    //Sum  s1=new Sum(); //sum is a class .it used to initialize the instance variable of class name .
    //it will initialize the object of class sum
  //  Sum s1;   //declaration of object
  //  s1=new Sum();//object instanttiation
    // (null pointer exceptionn is created if we do not instantiate the object)
    //means objecte too mill gya lakin jau kha store hoga ye nhi pta
   // s1 =new sum(10,20);
   new Sum(23,45).getSum(); //anonymous object (refrence nhi hota h aise object ka )
   Multi m1=new Multi();
   m1.getMulti(10,20);
  
    }
    
 }
// variables are the identifier which are used to store the data in the memory location
//identifier is the name given to varible , methods class and etc
// every variable has three attributes
// why variable is a variable because it can vary its value during the execution of the program
// vary means change variable get new memory location to store new value thats why it is called variable 
//what is constructor in java?
                                  /*Constructor in java*/
// constructor is a special type of method which is used to initialize the object
// constructor name is same as class name
// constructor does not have return type
// constructor is called when object is created
                    /* why constructor does not have return type?*/
// constructor is used to initialize the object and it does not return any value thats why it does
// all instance variable which declare as int are initialized to zera by default
// if we declare any instance variable as string it is initialized to null by default.

/*  deafault constructor */
// when we do not declare any constructor in the class java compiler
// automatically provides a default constructor
//when we create a parameterized constructor java compiler does not provide default constructor(not allowed default constructor)


