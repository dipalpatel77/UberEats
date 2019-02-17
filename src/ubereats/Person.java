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
public class Person 
{
    String fname;
    String lname;
    String address;
    String phone;

    public Person(String newFname, String newLname, String newAddress, String newPhone) {
        fname = newFname;
        lname = newLname;
        address = newAddress;
        phone = newPhone;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String newFname) {
        fname = newFname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String newLname) {
        lname = newLname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String newPhone) {
        phone = newPhone;
    }
}