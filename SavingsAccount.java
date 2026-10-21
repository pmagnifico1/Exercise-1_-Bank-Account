/** Represents a savings account with an owner name. */
public class SavingsAccount extends BankAccount {
  String ownerName;

  public SavingsAccount(String ownerName) {
    this.ownerName = ownerName;
    System.out.println("Account Owner: " + ownerName);
  }

  public void getOwnerName() {
    System.out.println("Owner Name: " + ownerName);
  }
  
}
