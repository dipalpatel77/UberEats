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
public class Menu {
    String name;
    String type;
    
    public Menu(String nName, String nType){
        name=nName;
        type=nType;
    }
    
    public String getname(){
        return name;
    }
    
    public void setname(String nName){
        name=nName;
    }
    
    public String gettype(){
        return type;
    }
    
    public void settype(String nType){
        type=nType;
    }
}
