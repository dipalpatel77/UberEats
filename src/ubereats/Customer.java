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
public class Customer extends Person
{
    String id;
    String type;
    
    public Customer(Date newId, String newType, String newFname, String newLname, String newAddress, String newPhone) {
        super(newId,newFname, newLname, newAddress, newPhone);
        id = createId(newId, newLname);
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
     public static String createId(Date id, String name)
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
        System.out.println("Id is: " +id + "\nType is: " + type);
        super.display();
    }
     
}