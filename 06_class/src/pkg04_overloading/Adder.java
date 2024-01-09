package pkg04_overloading;

public class Adder {
  
  int add(int[]a) {
  int sum=0;
    
    for(int b:a ) {
     sum+=b;
    }
    return sum; 
  }
  double add(double[]a) {
    double sum=0;
    
    for(double b:a ) {
     sum+=b;
    }
    return sum; 
  }
}
