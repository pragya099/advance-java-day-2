


import java.util.*;
class Student{
     private    int sid;//primary key should be added;
        private String name;
         private int marks;
         Student(int sid,String name,int marks){
            super();
             this.sid=sid;
             this.name=name;
             this.marks=marks;
         }
         public int getSid(){
             return sid;
         }
         public void setSid(int sid){

         }
          public String getName(){
           return name;
         }
         public void setName(String name){

         }
          public int getMarks(){
             return marks;
         }
         public void setMarks(int marks){

         }
         @Override
         public String toString(){
             return "Student [sid="+sid+",name="+name+",marks="+marks+"]";
         }



}


public class Main{
    public static void main(String[] args){
    ArrayList<Student> students=new ArrayList<>();
    students.add(new Student(1,"Alice",45));
    students.add(new Student(2,"Bob",90));
    students.add(new Student(3,"Charlie",38));
    students.add(new Student(4,"David",55));
    students.add(new Student(5,"Eve",50));
    //ystem.out.println(students);
    List<Student> g60=students.stream().filter(s->s.getMarks()>60).toList();
    g60.stream().forEach(System.out::println);
     //stem.out.println(g60);


    

    }
}
