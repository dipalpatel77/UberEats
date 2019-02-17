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
public class Category {
    String name;
    int id;
    
    public Category(String name , int id){
        this.name = name;
        this.id = id;
    }
      public void setname(String name) {
        this.name = name;
    }
       public void setid(int id) {
        this.id = id;
    }
       public String getname() {
        return name;
    }
       public int getid() {
        return id;
    }     
}
