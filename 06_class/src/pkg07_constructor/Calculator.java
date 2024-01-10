package pkg07_constructor;

public class Calculator {
  
  public void add(int...params) {
    int total=0;
    
    if(params.length ==0) {
      System.out.println("합:" + total);
      return;
    }
    
    if(params.length ==1) {
      total = params[0];
      System.out.println("합:" + total);
      return;
    }
    total = params[0];
    for(int a:params) {
      total +=a;
      System.out.print(" + "+ a);
    }
    System.out.println(" = " + total);
  }

}
