/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership;

/**
 *
 * @author oa1021
 */
public class Vehicle {
    //Vehicle class has nine fields
    public String Veh_Make;
    public int Veh_Vin;
    public double Veh_Price;
    public double Veh_NextPay;
    public double Veh_Remaining;
    public String Veh_Buyer;
    public int Veh_BuyNum;
    public String Veh_BuyAddress;
    public String Veh_NextDate;
    
    //the Vehicle class has a constructor
    //this constructor is based on nothing passed
    public Vehicle(){
        Veh_Make = "DEFAULT";
        Veh_Vin = 000000;
        Veh_Price = 000.00;
        Veh_NextPay = 000.00;
        Veh_Remaining = 000.00;
        Veh_Buyer = "DEFAULT";
        Veh_BuyNum = 0000000000;
        Veh_BuyAddress = "0000 DEFAULT";
        Veh_NextDate = "DEFAULT 00, 0000";
    }
    
    public void setMake(String newMake){
        Veh_Make = newMake;
    }
    
    public void setVin(int newVin){
        Veh_Vin = newVin;
    }
    
    public void setPrice(double newPrice){
        Veh_Price = newPrice;
    }
    
    public void setNextPay(double newNextPay){
        Veh_NextPay = newNextPay;
    }
    
    public void setRemaining(double newRemaining){
        Veh_Remaining = newRemaining;
    }
    
    public void setBuyer(String newBuyer){
        Veh_Buyer = newBuyer;
    }
    
    
    }

