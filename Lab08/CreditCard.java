//TASK#3 Pasing and returning Objects
package com.mycompany.lab08;


public class CreditCard {
    
    //Step 1.
    private Money balance;
    private Money creditLimit;
    private Person owner;
    
    //Step 2.
    public CreditCard(Person newCardHolder, Money limit){
        owner = newCardHolder;
        creditLimit = limit;
        balance = new Money(0);
    }
    
    //Step3.
    public Money getBalance(){
      return new Money(balance);
    }
    
    public Money getCreditLimit(){
        return new Money(creditLimit);
    }
    
    
    //Step 4.
    public String getPersonals(){
        return owner.toString();
    }
    
    
    //Step 5.
    public void charge(Money amount){
            System.out.println("Charge: " + amount);
            if(balance.add(amount).compareTo(creditLimit)<0){
                balance = balance.add(amount);
            }
            else{
             System.out.println("Error: Amount exceeds Credit Limit");  
            }
        
    }
    
    //Step 6.
    public void payment(Money amount){
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);
        
    }
    
    
    
}
