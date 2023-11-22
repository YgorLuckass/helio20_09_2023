public class Product {

    private int Number;
    private String Holder;
    private double Balance;

    public Product(String holder, double balance, int number){
        Holder = holder;
        Balance = balance;
        Number = number;
    }
    public Product(String holder, int number){
        Holder = holder;
        Number = number;
        this.Balance = 0;
    }

    public int getNumber() {
        return Number;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    public double getBalance() {
        return Balance;
    }


    public void Deposit(double amount){
        Balance += amount;
    }
    public void Withdraw(double amount){
        Balance =  (Balance -amount) - 5;
    }

    @Override
    public String toString() {
        return "Account " + Number + ", " + "Holder: " + Holder + ", Balance: " + String.format("%.2f", Balance);
    }
}





