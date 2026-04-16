package jdbcmysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class SavePointEx3 {
  public static void main(String[] args){
    //jdbc_driver
    
    //host
    String url = "jdbc:mysql://localhost:3306/studentdb";
    //password
    String username = "root";
    //username
    String password = System.getenv("DB_PASSWORD");
    Connection con = null;
    Savepoint sp1
    Savepoint sp2

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      
        con = DriverManager.getConnection(url,username,password); 
        Statement smt = con.createStatement();
        con.setAutoCommit(false);
        smt.executeUpdate("""
             insert into student(name,course,marks) values
             ('Student7','MBA',90),
             ('Student8','Btech',90)
             """);
        sp1 = con.setSavepoint("insert");

        smt.executeUpdate("""
             update student set course = "MCA" where name = "Student4"
             """);
        sp2 = con.setSavepoint("update");

        smt.executeUpdate("""
             delete from student where name =="Student2"
             """);

          
    } catch (ClassNotFoundException | SQLException e) {
      try{
        con.rollback(sp2);
        con.commit();
      }catch(SQLException e1){
        e1.printStackTrace();
      }
      e.printStackTrace();
    }finally{
      try {
        con.commit();
        con.setAutoCommit(true);
      } catch (SQLException e) {
        // TODO: handle exception
        e.printStackTrace();
      }
    }
  }
}
/*in mysql -
create table studentInfo(
id int primary key auto increment,
name varchar(50) not null,
photo mediumlob,
resume mediumtext  (16 mb and large is 1 tb may be)
);

newfile craete ClobBob.java
after addding connections
String insertQuery
*/