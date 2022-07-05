/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bse16
 */
public class Imply implements IStudent {
    //Student std;
    //Imply(String i, String n, String r){
      //  std= new Student();
    //}
    
    public List<Student> getStudents() throws Exception {  
      List<Student> list = new ArrayList<Student>();
      
      String JDBC_DRIVER= "com.mysql.jdbc.Driver";
      String DB_URL= "jdbc:mysql://localhost:3306/students";
      String user= "root";
      String pass= " ";
      
      Connection con= null;
      Statement stmt= null;
      
      Class.forName("com.mysql.jdbc.Driver");
      
      System.out.println("Connecting to database..");
      con= DriverManager.getConnection(DB_URL, user, pass);
      System.out.println("Connected database successfully");
      
      System.out.println("Creating Statement..");
      stmt= con.createStatement();
      String query= "SELECT * FROM students";
      ResultSet rs= stmt.executeQuery(query);
      
      while(rs.next()){
          String id= rs.getString("id");
          String name= rs.getString("name");
          String reg= rs.getString("reg");
          
          Student std= new Student();
          std.setID(id);
          std.setName(name);
          std.setRegNo(reg);
          list.add(std);
      }
      rs.close();
      return list;
    }

    
}
