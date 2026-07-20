package scenarioBased;

public class ATM {
    private double balance = 10000;
    private double amount;

    public void withdraw(double amount) throws Exception{
        if(amount>balance)
            throw new InsufficientBalanceException(balance, amount);

        balance -= amount;
        System.out.println("Balance Amount After Withdrawal: " +balance);
    }

    public static void main(String[] args) {
        ATM m = new ATM();

        try {
            m.withdraw(50000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
