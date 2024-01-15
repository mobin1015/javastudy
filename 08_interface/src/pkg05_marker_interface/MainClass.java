package pkg05_marker_interface;

public class MainClass {
  public static void main(String[] args) {
    
    Person person = new Person();
    person.eat(new AppleMango());
    person.eat(new PineApple());
    person.eat(new Durian());
    
    DurianHatePerson person2 = new DurianHatePerson();
    person2.eat(new AppleMango());
    person2.eat(new PineApple());
    // person2.eat(new Durian());  // 컴파일 오류
    
  }
}
