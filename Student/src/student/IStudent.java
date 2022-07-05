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
import java.rmi.*;
import java.util.List;

public interface IStudent extends Remote {
    public List<Student> getStudents() throws Exception;
}
