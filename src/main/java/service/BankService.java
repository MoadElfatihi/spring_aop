package service;

public class BankService {

    public void creditAccount(){
        System.out.println("crediting account ...");
    }

    public void debitAccount(){
        System.out.println("debit account ....");
    }

    public void transaction(int amount){
        System.out.println("starting transaction ....");
        if(amount<=0)
            throw new IllegalArgumentException("id can not be negative");
        System.out.println("ending transaction ....");
    }
}
