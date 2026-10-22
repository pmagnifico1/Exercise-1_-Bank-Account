/** Represents a savings account with an owner name. */
public class SavingsAccount extends BankAccount {
  private String ownerName; // Changed to private for encapsulation

  public SavingsAccount(String ownerName) {
    this.ownerName = ownerName;
    System.out.println("Account Owner: " + ownerName);
  }

  public String getOwnerName() { // Changed to return the owner's name instead of printing it
    return ownerName;
  }
}
