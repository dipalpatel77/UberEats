/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

import java.util.Date;

/**
 *
 * @author 1895269
 */
public class Order {
    
    Date Order_date;
    float Amount;
    public Order(Date dAte, float amnt)
    {
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
    
    public void paymentMethod()
    {
        System.out.println("Hello is payment method : ");
    }
    
    
}
