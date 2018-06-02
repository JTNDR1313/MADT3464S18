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
public class bank {
    String bankname;
    String bID;
    
     public bank() {
    }

    public bank(String bankname, String bID) {
        this.bankname = bankname;
        this.bID = bID;
    }

    public String getbankname() {
        return bankname;
    }

    public void setbankname(String bankname) {
        this.bankname = bankname;
    }

    public String getbID() {
        return bID;
    }

    public void setbID(String bID) {
        this.bID= bID;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankname='" + bankname + '\'' +
                ", id='" + bID+ '\'' +
                '}';
    }
}

