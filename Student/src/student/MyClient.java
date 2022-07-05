/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author bse16
 */
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
import java.util.*;  

public class MyClient {  
   private MyClient() {}  
   public static void main(String[] args)throws Exception {  
      try { 
         
         Registry registry = LocateRegistry.getRegistry(null); 
    
         IStudent stub = (IStudent) registry.lookup("Hello"); 
         List<Student> list = (List<Student>)stub.getStudents(); 
         for (Student s:list) {  
            System.out.println("ID: " + s.getId()); 
            System.out.println("name: " + s.getName()); 
            System.out.println("RegNo: " + s.getRegNo());  
         }  
      // System.out.println(list); 
      } catch (Exception e) { 
         System.err.println(e.toString());  
      } 
   } 
}
