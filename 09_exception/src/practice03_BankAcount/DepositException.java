package practice03_BankAcount;

public class DepositException extends BankException {

  public DepositException(int errorCode) {
    super(errorCode);
  }
  public DepositException(String message, int errorCode) {
    super(message, errorCode);
  }

}