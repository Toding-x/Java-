public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount() {}
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposite(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("余额为0");
        }
        this.balance -= amount;
        System.out.println(owner+"/s"+amount);

    }
    public void withdraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException("余额不足");
        }
        System.out.println(owner+"/s"+amount);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
