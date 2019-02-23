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
    }  
}