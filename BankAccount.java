/** Represents a bank account with deposit, withdrawal, and freeze operations. */
public class BankAccount {
  private double balance;
  private boolean isFrozen; // Changed to private for encapsulation

  public BankAccount() {
    this.balance = 0;
    this.isFrozen = false;
  }

  /** Deposits a positive amount unless the account is frozen. */
  public void deposit(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN. Unable to transact.");
      return;
    }

    System.out.printf("Amount deposited: %.2f%n", amount);

    if (amount > 0) {
      balance += amount;
      System.out.printf("Current balance: %.2f%n", balance);
    } else {
      System.out.println("Invalid amount. Must be greater than 0.");
    }
  }

  /** Withdraws a positive amount if sufficient funds are available. */
  public void withdraw(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN. Unable to transact.");
      return;
    }

    System.out.printf("Amount withdrawn: %.2f%n", amount);

    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.printf("Current balance: %.2f%n", balance);
    } else if (amount > balance) {
      System.out.printf("Insufficient balance. Current balance: %.2f%n", balance);
    } else {
      System.out.println("Invalid amount. Must be greater than 0");
    }
  }

  public double getBalance() {
    return balance;
  }

  public void freezeAccount() {
    isFrozen = true;
    System.out.println("Account is now FROZEN.");
  }

  public void unfreezeAccount() {
    isFrozen = false;
    System.out.println("Account is now UNFROZEN.");
  }
}