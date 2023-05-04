package bankAccProject;

public class Main {
    public static void main(String[] args){
        /* bankAccount AribaAccount = new bankAccount("0123456789", 1000, "XYZ",
                "xyz@gmail.com", "0320123456");

        System.out.println("\n\t\tAccount information\n\n" +
                "Name: " + AribaAccount.getCustomerName() +
                "\nAccount Balance: " + AribaAccount.getBalance() +
                "\nAccount Number: " + AribaAccount.getAccNumber() +
                "\nEmail: " + AribaAccount.getEmail() +
                "\nPhone No: " + AribaAccount.getPhoneNo() + "\n\n");

        AribaAccount.depositFund(200);
        AribaAccount.withdrawFund(1000); */

        /* bankAccount xyz = new bankAccount();
        System.out.print("\nName: " + xyz.getCustomerName() + "\nAcc Balance: " + xyz.getBalance());
         */

        VipCustomer person1 = new VipCustomer();
        System.out.print("\nName: " + person1.getName() + "\nCredit Limit: " + person1.getCreditLimit() +
                "\nEmail: " + person1.getEmailAddress() + "\n");


    }
}
