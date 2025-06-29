package src.main.java.com.model;

import java.math.BigDecimal;

public class Customer {
    private int id;
    private String name;
    private double balance;

    public Customer(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    // setters

    public void setName(){
        this.name = name;
    }

    public void setBalance(){
        this.balance = balance;
    }

}
