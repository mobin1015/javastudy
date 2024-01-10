package pkg07_constructor;

import pkg09_access_modifier.Calculator;

public class Computer {
  
  // field
  String model;
  int price;
  Calculator calculator;
  
  // constructor
  Computer() {
    System.out.println("Computer()");
  }
  Computer(String _model, int _prcie) {
    model = _model;
    price = _prcie;
  }
  Computer(String _model, int _price, Calculator _calculator) {
    model = _model;
    price = _price;
    calculator = _calculator;
  } 
  
  // method
  void develop() {
    System.out.println(model + "이용해서 개발중");
  }
  
  void danggeun( ) {
    System.out.println(price / 100 * 60 + "원에 쿨거래");
  }


}
