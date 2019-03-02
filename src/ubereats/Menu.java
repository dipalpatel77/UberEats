/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author 1894343
 */
public class Menu {
    String id;
    String name;
    String type;
    
    Category ct;
    Restaurant rest;
    public Menu(Date new_Id,String nName, String nType){
        id=createId(new_Id,nName);
        name=nName;
        type=nType;
    }
    public void setId(String newId){
        id=newId;
    }
    
    public String getId(){
        return id;
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
        System.out.println("Id is: " + id + "\n Name: " + name + "\nType is: " + type);
    }
}
