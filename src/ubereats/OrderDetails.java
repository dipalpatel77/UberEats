/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

import java.text.SimpleDateFormat;
import java.util.Date;
import static ubereats.Order.createId;

/**
 *
 * @author 1895269
 */
public class OrderDetails {
    int Quantity;
    String id;
    public OrderDetails(Date newId, int qnt)
    {   
        Quantity = qnt;
          id = createId(newId, "");
    }
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quant) {
        Quantity = Quant;
    }
    public OrderDetails(int qnt)
    {
        Quantity = qnt;
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
        System.out.println("Id is: " + id + "\nQuantity is : " + Quantity);
    }
}