import java.util.ArrayList;
import java.util.List;

public class Client {
    private String clientID;
    private String password;
    private String clientName;
    private String clientEmail;
    private int phoneNum;
    private String address;
    List<Account> account;
}

public void Client (String clientID, String password, String clientName, String clientEmail, int phoneNum, String address) {
    this.clientID = clientID;
    this.password = password;
    this.clientName = clientName;
    this.clientEmail = clientEmail;
    this.phoneNum = phoneNum;
    this.address = address;
    this.account = new ArrayList<>();
}

public void openAccount (Account account) {
    this.account.add(account);
}

public void closeAccount (Account account) {
    this.account.remove(account);
}

public void viewBalance (Account account) {
    System.out.println("Account balance: " + account.getBalance());
}

public void viewTransactions (Account account) {
    System.out.println("Account transactions: " + account.getTransactions());
}

public boolean validatePassword (String password) {
    return this.password.equals(password);
}

public void getPassword (String password) {
    this.password = password;
}

