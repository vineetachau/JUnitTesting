package co.edu;

public class Account {

	private int acctNo;
    private String owner;
    private int balance;

    public Account() {
        acctNo = 0;
        owner = "";
        balance = 0;
    }

    public Account(int no, String own, int bal) {
        this.acctNo = no;
        this.owner = own;
        this.balance = bal;
    }

    public int getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(int no) {
        this.acctNo = no;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String own) {
        this.owner = own;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int bal) {
        this.balance = bal;
    }

    public void withdraw(int amt) throws InsufficientFundsException {
        if(amt <= balance) {
            balance -= amt;
        }
        else {
            int newBalance = amt - balance;
            throw new InsufficientFundsException(newBalance);
        }

    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public static void main (String args[]) {
        Account ac = new Account(1234, "david", 15000);
        try {
            ac.withdraw(1500);
        }catch(InsufficientFundsException e)
        {
            System.out.println("Account number: " +ac.getAcctNo());
            System.out.println("owner: " +ac.getOwner());
            System.out.println("Balance is :" +ac.getBalance() );
        }
    }
}
