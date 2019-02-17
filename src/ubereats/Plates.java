/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

/**
 *
 * @author 1895277
 */
public class Plates {
    String name;
    String description;
    int price;
    
    public Plates(String newName , String newDescription , int newPrice){
        name = newName;
        description = newDescription;
        price = newPrice;
    }
      public void setname(String newName) {
        name = newName;
    }
        public void setdescription(String newDescription) {
        name = newDescription;
    }  
        public void setprice(int newPrice) {
        price = newPrice;
    }
         public String getname() {
        return name;
    }
          public String getdescription() {
        return description;
    }
           public int getprice() {
        return price;
    }
}