import java.util.ArrayList;

public class Account {
    // name of accounts
    private String name;

    // account current balance
    private double balance;

    // account unique ID
    private String uuid;

    // the user who owns the account
    private User holder;

    // list of transactions in this account
    private ArrayList<Transaction> transactions;
}