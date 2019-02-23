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
public class Driver extends Person
{
    String id;
    String carDetails;
    String driverLicense;
    
    public Driver(Date newId,String newCarDetails, String newDriverLicense, String newFname, String newLname, String newAddress, String newPhone) {
        super(newId,newFname, newLname, newAddress, newPhone);
        carDetails = newCarDetails;
        driverLicense = newDriverLicense;
    } 
    
    public void setId(String new_id){
        id=new_id;
    }
    
    public String getId(){
        return id;
    }
    
    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String newCarDetails) {
        carDetails = newCarDetails;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String newDriverLicense) {
        driverLicense = newDriverLicense;
    }
     public void display()
    {
        System.out.println("Id is: " +super.id + "\ncarDetails: " + carDetails + "\nDriverLicense:" +driverLicense);
        super.display();
    }
}