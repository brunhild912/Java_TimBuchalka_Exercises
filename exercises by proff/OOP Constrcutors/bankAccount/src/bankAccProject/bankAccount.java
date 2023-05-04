package bankAccProject;
public class bankAccount {

    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNo;

    /* constructor */

    public bankAccount(){
        this("000", 0, "xyz", "xyz@xyz.xyz", "000");
        System.out.println("Default constructor called.\n");
    }
    public bankAccount( String accNumber, double balance,
                        String customerName, String email, String phoneNo){
        System.out.println("Parametrized constructor called.\n");
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    /* methods */

    //    setters
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

//    getters

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    //    method to allow user to deposit fund and increment balance
    public void depositFund(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposited amount is " + depositAmount + ". New balance is " + this.balance);
    }

    //    method to allow user to withdraw and this decrements balance
    public void withdrawFund(double withdrawAmount){
        if (this.balance - withdrawAmount < 0){
            System.out.println("Only " + this.balance + " amount left. Withdrawal not processed.\n");
        }
        else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " amount processed. Remaining balance is " + this.balance);
        }
    }

}

