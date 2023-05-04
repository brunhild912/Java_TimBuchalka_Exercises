package bankAccProject;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("default name" , 1000.00, "default_email@xyz.com");
        System.out.print(" Default constructor called.");
    }

    public VipCustomer(String name, double creditLimit){

        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
