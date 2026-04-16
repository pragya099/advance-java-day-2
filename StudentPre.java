package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentPre {
  public static void main(String[] args){
    String url = "jdbc:mysql://localhost:3306/studentdb";
    
    String username = "root";
    
    String password = System.getenv("DB_PASSWORD");
    String query = "SELECT * from student where course=?";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection com = DriverManager.getConnection(url,username,password); 
      PreparedStatement pst = com.prepareStatement(query);
      pst.setString(1,"MCA");
      ResultSet rs = pst.executeQuery();
      System.out.println("ID\tName\t\tCourse\tMarks");
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String course = rs.getString("course");
            Long marks = rs.getLong("marks");
            System.out.println(String.format("%d\t%s\t%s\t%d",id,name,course,marks));
        }
      rs.close();
      pst.close();
      com.close();  
    } catch (ClassNotFoundException  | SQLException e) {
      e.printStackTrace();
    }
    
  }
}
