
package com.mycompany.accountdriver;


public class CheckingAccount extends BankAccount {
    
    private static final double FEE = .15;
    
    public CheckingAccount(String name, double amount){
        super(name, amount);
        super.setAccountNumber(super.getAccountNumber() + "-10");
    }
    
    @Override
    public boolean withdraw(double amount){
        amount = amount + FEE;
        return super.withdraw(amount);
    }
    
    
}
