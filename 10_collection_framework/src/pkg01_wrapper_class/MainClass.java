package pkg01_wrapper_class;

public class MainClass {

  public static void main(String[] args) {

    // Auto Boxing (기본 타입 값 -> Wrapper 타입)
    Integer num = 10;
    
    // Auto Unboxing (Wrapper 타입 -> 기본 타입)
    int iNum = num;
    
    Integer num2 = iNum;
    num2 +=1;
   
    System.out.println(num2+1);

    
  }


}
