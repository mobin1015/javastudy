package pkg02_Fuctionalinterface;

public class MainClass {

  public static void main(String[] args) {

    // interface MyInterface1 { void mehtod();}
    MyInterface1 my1 = () -> System.out.println("hello world");
    my1.method();
    
    // interface MyInterface2 { String mehtod();} 본문이 1개면 리턴마저 생략 가능
    
    MyInterface2 my2_2 = () -> "hello world";
    System.out.println(my2_2.method());

    // interface MyInterface3 { void method(String name); }
    MyInterface3 my3 = (name) -> System.out.println(name + "님");
    my3.method("박모빈왕자");
    
    // interface MyInterface4 { String method(String name); }
    MyInterface4 my4 = (name) -> name + "님";
    System.out.println(my4.method("박모빈회장"));
    
  }

}
