package practice03_Employee;

public class PartTime extends Employee{
  
  // filed
  private int hourPay;

  
  
  public PartTime(int empNo, String name, int hourPay) {
    super(empNo, name);
    this.hourPay = hourPay;
  }

  public PartTime(int empNo, String name) {
    super(empNo, name);
  }

  public int getHourPay() {
    return hourPay;
  }

  public void setHourPay(int hourPay) {
    this.hourPay = hourPay;
  }
  
  
  @Override
  public void info() {
    super.info();
    System.out.println("시금 : " + hourPay);
  }
  
  
  
  

}
