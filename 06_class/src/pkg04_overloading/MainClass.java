package pkg04_overloading;

public class MainClass {

  public static void main(String[] args) {
    // Calculator 객체 생성
    Calculator calculator = new Calculator();
    
    // Adder 객체 생성
    Adder adder = new Adder();
    
    // Calculator 객체 add 메소드 호출
    calculator.add(adder, 5, 55,5,5,5);
    calculator.add(adder, 5.1, 55.4,5.5,5.3,5);
  }

}
