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
public class Student implements java.io.Serializable {

    private String id;
    private String name;
    private String reg;
    
    public String getId() { 
      return id; 
   } 
   public String getName() { 
      return name; 
   } 
   public String getRegNo() { 
      return reg; 
   } 
   public void setID(String id) { 
      this.id = id; 
   } 
   public void setName(String name) { 
      this.name = name; 
   } 
   public void setRegNo(String reg) { 
      this.reg = reg; 
   }
}
