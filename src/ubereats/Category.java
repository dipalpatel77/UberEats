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
    String id;
    
    Menu mn;
    public Category(String newName , String newId){
       name = newName;
        id = newId;
    }
      public void setname(String newName) {
        name = newName;
    }
       public void setid(int newId) {
        id = newId;
    }
       public String getname() {
        return name;
    }
       public int getid() {
        return id;
    }     
}