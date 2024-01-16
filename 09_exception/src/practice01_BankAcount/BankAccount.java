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
  
  // 1. 메소드 마다 try - catch 넣기
  // 2. 메소드 호출한 곳으로 예외 던지기
  
  public void deposit(long a)   {
    try {
      if(a <= 0) {
        throw new RuntimeException(a + "원 입금 불가");
      }  
    this.balance += a;
    System.out.println("입금 성공");}
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  
  
  
  public long withdrawal(long a)  {
    try {
    if(a > this.balance||a <= 0) {
      throw new RuntimeException();
      
    } 
    this.balance -= a;
    System.out.println("출금 성공");
    return a;
    
    }catch(RuntimeException e) {
      System.out.println("출금 불가");
      return 0L;
      
    }
  }
  
  public void transfer(BankAccount acount, long a) {

    acount.deposit(withdrawal(a));
    
  }
  
  
}
