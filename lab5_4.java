class Bank_Account {
    int accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;

    public String getAccountDetails() {
        return 
                "Account No: " + accountNo + "\n" +
                "User Name: " + userName + "\n" +
                "Email: " + email + "\n" +
                "Account Type: " + accountType + "\n" +
                "Account Balance: " + accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println(getAccountDetails());
    }
}

public class lab5_4 {
    public static void main(String[] args) {
        Bank_Account a1 = new Bank_Account();
        a1.accountNo = 1;
        a1.userName = "Navy Butani";
        a1.email="navybutani25@gmail.com";
        a1.accountType = "Savings Account";
        a1.accountBalance = 10000000;
        a1.displayAccountDetails();
    }
}
