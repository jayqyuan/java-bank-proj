import java.util.ArrayList;

public class User{
    // user first name
    private String firstName;

    // user last name
    private String lastName;

    // unique ID number of users
    private String uuid;

    // the hash of users pin number
    private byte pinHash[];

    // list of accounts associated with this user
    private ArrayList<Account> accounts;
}