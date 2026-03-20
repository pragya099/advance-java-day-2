public class Welcome //access modifier defines scope of the class when we not define any access modifier 
                      //it is considered as default(public) access modifier we use public so that this classacan be acccessed by everypackage.
{
    public static void main(String[] args)
    //array of string class object   (/dir with space command line arguments(controlling flow of code through command  line  agguments called in main method))
                                            //static means this method belongs to the class rather than object of the class
                                     //Static method can be called without creating object of the class
                                            //public means this method can be accessed from outside the class
                                              //void means this method does not return any value
                                              //String[] args is used for command line arguments
 {                                          //main method is the entry point of any Java program
     System.out.printf("Welcome to java ");   
 //out is the object of printstream class
 //println (and printf)is the method of printstream class which is used to print 
 //the statement and move the cursor to the next line
 //System is a predefined class in java.lang package
 }
}
