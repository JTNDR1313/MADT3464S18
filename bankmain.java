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
public class bankmain {
    

    public static void main(String arsg[]) {
       BankAccount Arshdeep = new BankAccount();
       Arshdeep.setbankname("Sctia");
       Arshdeep.setAccountnumber("110");
       Arshdeep.setAmount(500.00);
       Arshdeep.setOwnername("Arshdeep Singh");
       Arshdeep.setbID("E10");
       System.out.print(Arshdeep.toString());


        BankAccount Jatinder = new BankAccount();
        Jatinder.setbankname("TD");
        Jatinder.setAccountnumber("111");
        Jatinder.setAmount(600.00);
        Jatinder.setOwnername("Jatinder Singh");
        Jatinder.setbID("E11");
        System.out.print(Jatinder.toString());
    }
}

