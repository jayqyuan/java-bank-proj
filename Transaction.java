import java.util.Date;

public class Transaction {
    // the ammount of this transaction
    private double amount;

    // time and date of the transaction
    private Date timestamp;

    // memo for this transaction
    private String memo;

    // account that the transaction was perfomed on
    private Account inAccount;
}