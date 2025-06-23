public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("12345", "Alice", 1000.0, 5.0);
        sa.deposit(200);
        sa.withdraw(100);
        sa.applyInterest();
        System.out.println("Current Balance: " + sa.checkBalance());
    }
}
