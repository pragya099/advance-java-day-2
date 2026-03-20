

//overloading can be done in different class

//this class can be abstract and interface

class Animal{
  String name;
  String sound;
  void makeSound(){
    System.out.println("This is animal class");
  }

  //number of parameters and their datatypes should be different (if two methods have same number of parameters)

  // String makeSound(String name,String sound){
  
  // String makeSound(String name,int sound){
  //   System.out.println("This is animal class");
  //   return "";
  // }
  void makeSound(String name, String sound){
    String result = String.format("Name = %s and Sound = %s",name,sound);
    System.out.println(result);
  }
  void display(){

    String result = String.format("Name = %s and Sound = %s",name,sound);
    System.out.println(result);
  }
}

class Cat extends Animal{
  int legs;
  //reason to build constructor - to initialize instance variable
  //name and sound instance variable must also instantiate now 
  Cat(String name , String sound,int legs){
    //this is kyu nhi kiya = kyunki testing me problem aa sakti hai , compile will checks first in this class then it will check parent class intsance variable

    //hamesha super class ka constructor bnana jaruri h
    super.name = name;
    super.sound = sound;
    this.legs = legs;
  }
  
  @Override
  void makeSound(){
    // String result = String.format("Name = %s and Sound = %s and legs = %s",name,sound,legs);
    System.out.println("static make sound subclass");
  }
  void displayInfo(){
    System.out.println("subclass display info");
  }
}

public class MainPoly {
  public static void main(String[] args){
    Animal n1 = new Animal();
    n1.makeSound();
    n1.makeSound("Dog","Bark");
    n1.display();
    // Cat c1 = new Cat("cat1","meow",4);
    //upcasting - can access all methods of its parent class
    Animal c1 = new Cat("cat1","meow",4);
    c1.makeSound(); //overrides its parent class method
    c1.display();
    //over-hidden
  }
}