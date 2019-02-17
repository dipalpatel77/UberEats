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
    String Name;
    String Address;
    int Phone;
    
    public Restaurant(String Name, String Address, int Phone){
        this.Name=Name;
        this.Address=Address;
        this.Phone=Phone;
    }
    
    public void setName(String name){
        this.Name=name;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setAddress(String address){
        this.Address=address;
    }
    
    public String getAddress(){
        return Address;
    }
    
    public void setPhone(int phone){
        this.Phone=phone;
    }
    
    public int getPhone(){
        return Phone;
    }
}
