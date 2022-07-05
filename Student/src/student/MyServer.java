/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author bse16
 */
public class MyServer extends Imply {
    public MyServer() {}
    public static void main(String args[]) throws AlreadyBoundException{
        try{
            Imply obj= new Imply();
            
            IStudent stub= (IStudent) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry= LocateRegistry.getRegistry();
            registry.bind("IStudent", stub);
            System.err.println("Server ready");
        } catch(RemoteException e){
            System.err.println(e.toString());
        }
    }
}
