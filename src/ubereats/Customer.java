/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

import java.util.Date;

/**
 *
 * @author 1895314
 */
public class Customer extends Person
{
    String id;
    String type;
    
    public Customer(Date newId, String newType, String newFname, String newLname, String newAddress, String newPhone) {
        super(newId,newFname, newLname, newAddress, newPhone);
        type = newType;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String newId) {
        id = newId;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    } 
     public void display()
    {
        System.out.println("Id is: " +super.id + "\nType is: " + type);
        super.display();
    }
     
}