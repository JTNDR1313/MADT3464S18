/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author macstudent
 */
public class BankAccount extends bank {
    String Accountnumber;
    String ownername;
    double amount;

    public BankAccount() {
        super();
    }

    public BankAccount(String bankname, String bID, String accountnumber, String ownername, double amount) {
        super(bankname, bID);
        Accountnumber = accountnumber;
        this.ownername = ownername;
        this.amount = amount;
    }

    public String getAccountnumber() {
        return Accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        Accountnumber = accountnumber;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "Accountnumber='" + Accountnumber + '\'' +
                ", ownername='" + ownername + '\'' +
                ", amount=" + amount +
                ", bankname= " + bankname + '\'' +
                ", bID='" + bID + '\'' +
                '}'+"\n";
    
}
}
