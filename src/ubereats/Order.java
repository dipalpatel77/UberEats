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
 * @author 1895269
 */
public class Order {
    
    Date Order_date;
    float Amount;
    String id;
    
    Customer cust;
    Driver dr;
    Plates pl;
    
    public Order(Date dAte, float amnt)
    {
        id = createId(dAte, "");
        Order_date = dAte;
        Amount = amnt;
    }
    public Date getOrder_date() {
        return Order_date;
    }

    public void setOrder_date(Date Orderdate) {
        Order_date = Orderdate;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amnt) {
        Amount = Amnt;
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
        System.out.println("Id is: " + id + "\nOrder Date is : " + Order_date +  "\nTotal amount is : " + Amount );
    }
    
}
