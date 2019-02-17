/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

/**
 *
 * @author 1895314
 */
public class Customer extends Person
{
    int id;
    String type;
    
    public Customer(int newId, String newType, String newFname, String newLname, String newAddress, String newPhone) {
        super(newFname, newLname, newAddress, newPhone);
        id = newId;
        type = newType;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    } 
}