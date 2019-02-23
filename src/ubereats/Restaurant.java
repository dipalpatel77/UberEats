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
 * @author 1894343
 */
public class Restaurant {
    String id;
    String name;
    String address;
    int phone;
    
    Menu mn;
    public  Restaurant(Date new_Id, String new_Name, String new_Address, int new_Phone){
        id = createId(new_Id, new_Name);
        name=new_Name;
        address=new_Address;
        phone=new_Phone;
    }
    
    public void setId(String newId){
        id=newId;
    }
    
    public String getId(){
        return id;
    }
    
    public void setname(String new_Name){
        name=new_Name;
    }
    
    public String getname(){
        return name;
    }
    
    public void setaddress(String new_Address){
       address=new_Address;
    }
    
    public String getaddress(){
        return address;
    }
    
    public void setphone(int new_Phone){
       phone=new_Phone;
    }
    
    public int getphone(){
        return phone;
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
        System.out.println("Id is: " + id + "\nName is: " + name + "\nAddress is: " + address + "\nPhone is: " + phone);
    }
}
