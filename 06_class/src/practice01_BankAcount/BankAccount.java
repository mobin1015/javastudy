package practice01_BankAcount;

public class BankAccount {
  
  // field
  private String accNo;

  private long balance;
  
  public BankAccount(  ) {

  }
  
  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }
  
  public String getAccNo( ) {
    return this.accNo ;
    
  }
  public long getBalance( ) {
    return this.balance ;
  }
  
  public void setAccNo(String AccNo ) {
    this.accNo = AccNo;
    
  }
  public void setBalance(long blc) {
    this.balance = blc;
  }
  
  public void deposit(long a) {
    if(a<=0) {
      System.out.println("입금하실 수 없는 금앱니다.");
      return ;
    }
    this.balance += a;
    System.out.println("입금 성공");
  }
  
  public long withdrawal(long a) {
    if(a > this.balance) {
      System.out.println( a + "원 출금 불가");
      return 0L;
    }
    
    if(a <= 0) {
      System.out.println( "잔액 부족");
      return 0L;
    }
    this.balance -= a;
    System.out.println("출금 성공");
    return this.balance ;
  }
  
  public void transfer(BankAccount acount, long a) {

    acount.deposit(withdrawal(a));
    
  }
  
  
}
