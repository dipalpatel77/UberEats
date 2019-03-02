/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

import java.text.SimpleDateFormat;
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
        id = createId(newId, newLname);
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
    public String createId(Date id, String name)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
        String dt = sdf.format(id);
        String[] date = dt.split("-");
        String formatedDate = date[0].substring(2);
        formatedDate += "-" + date[1];
        if(Integer.parseInt(date[2])%2==0)
        {
            formatedDate += "-" + "E";
        }
        else
        {
            formatedDate += "-" + "O";
        }
        if(name.equals(""))
        {
            formatedDate += "-" + "XX";
        }
        else if(name.length()==1)
        {
            formatedDate += "-" + name.toUpperCase() + "X";
        }
        else if(name.length()==2)
        {
            formatedDate += "-" + name.toUpperCase();
        }
        else
        {
            formatedDate += "-" + name.substring(0, 1).toUpperCase() + name.substring(name.length()-1).toUpperCase();
        }
        return formatedDate;
    }
     public void display()
    {
        System.out.println("Id is: " +id + "\ncarDetails: " + carDetails + "\nDriverLicense:" +driverLicense);
        super.display();
    }
}