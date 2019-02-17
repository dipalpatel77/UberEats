/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubereats;

/**
 *
 * @author 1895269
 */
public class OrderDetails {
    int Quantity;

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
}