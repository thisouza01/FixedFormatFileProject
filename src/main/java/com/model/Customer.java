package src.main.java.com.model;

public class Customer {
    private String id;
    private String name;
    private double balance;

    public Customer(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters
    public String getId() { return id; }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    // setters
    public void setId() { this.id = id; }

    public void setName(){
        this.name = name;
    }

    public void setBalance(){
        this.balance = balance;
    }

}
