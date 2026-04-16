package jdbcmysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentEx3 {
  public static void main(String[] args){
    //jdbc_driver
    
    //host
    String url = "jdbc:mysql://localhost:3306/studentdb";
    //password
    String username = "root";
    //username
    String password = System.getenv("DB_PASSWORD");
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      
        Connection con = DriverManager.getConnection(url,username,password); 
        CallableStatement csmt = con.prepareCall("{call getStudents()}");
        ResultSet rs = csmt.executeQuery();
        System.out.println("ID\tName\tCourse\tMarks");

        
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String course = rs.getString("course");
            Long marks = rs.getLong("marks");
            System.out.println(String.format("%d\t%s\t%s\t%d",id,name,course,marks));
        }
         
      rs.close();
      csmt.close();
      con.close();
    } catch (ClassNotFoundException | SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}

