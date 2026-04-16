package jdbcmysql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.InputMismatchException;

public class ClobBlob {
  public static void main(String[] args){
    //jdbc_driver
    
    //host
    String url = "jdbc:mysql://localhost:3306/studentdb";
    //password
    String username = "root";
    //username
    String password = System.getenv("DB_PASSWORD");
    String insertQuery = """
        insert into StudentInfo(name,photo,resume)
        values(?,?,?);
        """;
    File resume= new File("demo.txt");
    String readQuery = "select * from studentInfo";
    File photo = new File("java8.png"); 
    try {
      FileReader frResume = new FileReader(resume);
      FileInputStream fiPhoto = new FileInputStream(ohoto);
        Class.forName("com.mysql.cj.jdbc.Driver");
      
        con = DriverManager.getConnection(url,username,password); 
        Statement smt = con.createStatement();

        //write query
        // PreparedStatement pst = con.preparedStatement(insertQuery);
        // pst.setString(1, "Student9");
        // pst.setBinaryStream(2,fisPhoto,(int)photo.length());
        // pst.setCharacterStream(3,frResume, (int)resume.length());
        // smt.executeUpdate();
        // System.out.println("Resume inserted");

      //read query
      Statement smt = con.createStatement();
      ResultSet rs = smt.executeQuery(readQuery);
      while(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        InputStream is = rs.getBinaryStream("photo");
        FileOutputStream fos = new FileOutputStream("photo.png");
        byte[] buff = new byte[1024];
        while((len=is.read(buff))!=-1){
          fos.write(buff,0,len);
        }
        fos.close();

        Reader rd = rs.getCharacterStream("resume");
        BufferReader br = new BufferReader(rd);
        System.out.println("ID"+id+",Name ="+name);
        while((line=br.readLine())!=null){
          System.out.println(line);
        }
      }
          
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
//why phone number in dbms must be = varchar<or string type) = because we dont wamt any operation on it
