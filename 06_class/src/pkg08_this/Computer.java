package pkg08_this;

public class Computer {
  
  String model ;
  int price;
  
  
  // this() : 생성자를 호출하는 것
  // this.멤버 : 멤버(필드, 메소드)를 호출하는 것
  
  Computer() {
    this(null, 0);
  }
 
  Computer(String model) {
    this(model,0);
  }
  
  Computer(String model, int price) {
    this.model = model;
    this.price = price;
  }
  
  public void showThis() {
    System.out.println(this); 
  }
  public void showModel() {
    System.out.println(this.model); 
  }
}
