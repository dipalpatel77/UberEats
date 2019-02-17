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
public class Driver extends Person
{
    String carDetails;
    String driverLicense;
    
    public Driver(String newCarDetails, String newDriverLicense, String newFname, String newLname, String newAddress, String newPhone) {
        super(newFname, newLname, newAddress, newPhone);
        carDetails = newCarDetails;
        driverLicense = newDriverLicense;
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
}