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
public class UberEats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Restaurant res = new Restaurant(new Date(), "Nish", "Montreal", 3246187);
        res.display();
        Customer cust=new Customer(new Date(), "Veg", "Nish", "Gupta", "Montreal", "3246187");
        cust.display();
        Order ord = new Order(new Date(), (float) 55.3);
        ord.display();
        OrderDetails ordD = new OrderDetails(new Date(),4);
        ordD.display();
        Person per = new Person(new Date(), "Dipal", "Patel", "Gujrat", "5146897865");
        per.display();
        Driver dr = new Driver(new Date(), "123743", "234jb34934j", "Jay", "Shah", "Gujrat", "5146211699");
        dr.display();
        Plates pt = new Plates(new Date(), "Thali", "Lunch", 10);
        pt.display();
        Category ct = new Category("dinner", new Date());
        ct.display();
        Menu mn = new Menu(new Date(), "Thai", "Veg");
        mn.display();
    }  
}