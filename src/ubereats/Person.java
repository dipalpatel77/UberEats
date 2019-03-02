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
public class Person 
{
    String id;
    String fname;
    String lname;
    String address;
    String phone;

    public Person(Date new_Id,String newFname, String newLname, String newAddress, String newPhone) {
         id = createId(new_Id, newFname);
        fname = newFname;
        lname = newLname;
        address = newAddress;
        phone = newPhone;
    }
    
    public void setid(String newId){
      id=newId;  
    }
    
    public String getid(){
        return id;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String newFname) {
        fname = newFname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String newLname) {
        lname = newLname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String newPhone) {
        phone = newPhone;
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
        System.out.println("Id is: " + id + "\nName is: " + fname +  "\nAddress is: " + address + "\nPhone is: " + phone);
    }
}