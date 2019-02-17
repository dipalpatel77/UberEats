/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

/**
 *
 * @author 1894343
 */
public class Restaurant {
    String name;
    String address;
    int phone;
    
    public  Restaurant(String new_Name, String new_Address, int new_Phone){
        name=new_Name;
        address=new_Address;
        phone=new_Phone;
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
}
