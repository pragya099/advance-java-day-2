package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
  public static void main(String[] args){
    //jdbc_driver
    
    //host
    String url = "jdbc:mysql://localhost:3306/studentdb";
    //password
    String username = "root";
    //username
    String password = System.getenv("DB_PASSWORD");
    String create_table = """
        CREATE TABLE IF NOT EXISTS student(
        id INT PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(50) NOT NULL,
        course VARCHAR(50),
        marks DECIMAL(10,2)
        )
        """;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      
        Connection com = DriverManager.getConnection(url,username,password); 
        // Statement smt = com.createStatement();

        // Statement smt = com.createStatement(
        //   ResultSet.TYPE_FORWARD_ONLY,
        //   ResultSet.CONCUR_READ_ONLY
        // );

        Statement smt = com.createStatement(
          ResultSet.TYPE_SCROLL_SENSITIVE,
          ResultSet.CONCUR_UPDATABLE
        );

        smt.execute(create_table);
        System.out.println("Student table ready"); 


        //insert data into table
        // int rowAffected = smt.executeUpdate("""
        //     insert into student(name,course,marks) values
        //     ('Student1','MCA',90.5),
        //     ('Student2','MCA',93),
        //     ('Student3','MBA',95),
        //     ('Student4','Btech',92)
        //     """);
        //  if(rowAffected>0){
        //   System.out.println("record inserted");
        // }else{
        //   System.out.println("record is not inserted");
        // }

        ResultSet rs = smt.executeQuery("SELECT * FROM student");
        rs.moveToInsertRow();
        rs.updateString("name","Student4");
        rs.updateString("course","Mca");
        rs.updateLong("marks",60);
        rs.insertRow();
        System.out.println("ID\tName\t\tCourse\tMarks");
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String course = rs.getString("course");
            Long marks = rs.getLong("marks");
            System.out.println(String.format("%d\t%s\t%s\t%d",id,name,course,marks));
        }
        // while(rs.next()){
        //   long marks = rs.getLong("marks");
        //   if(marks<=70){
        //     rs.updateLong("marks",marks+5);
        //     rs.updateRow();
        //   }
        //   int id = rs.getInt("id");

        //   String name = rs.getString("name");
        //   String course = rs.getString("course");
        //   marks = rs.getLong("marks");
        //   System.out.println(String.format("%d\t%s\t%s\t%d",id,name,course,marks));
        // }
      rs.close();
      smt.close();
      com.close();
    } catch (ClassNotFoundException | SQLException e) {
     
      
      System.out.println(e.getMessage());
    }
  }
}

// 1. Add JAR → gives ability to connect
// 2. Load driver → activates driver
// 3. Provide URL/username/password → authentication
// 4. Get Connection → connect to DB
// 5. Create Statement → prepare to send SQL
// 6. Execute queries → interact with DB
// 7. ResultSet → read data

// Java → Driver → MySQL

// Step Purpose
// JAR Add MySQL support
// Class.forName Load driver
// URL Where DB is
// Username/Password Authentication
// Connection Connect
// Statement Send SQL
// ResultSet Get data

// types of driver
// network - ip+ port number -->socket programming
// ip tells system within the network and port tells the particular application
// in that network
// browser automatically adds the port

// why path variable is used in windows(environmental variables)?

// DLL - execute
// DML - executeUpdate
// DQL - executeQuery

//collable statement - study cursor , procedure , trigger in dbms
//                   - study sql injection, to learn about collable statement
