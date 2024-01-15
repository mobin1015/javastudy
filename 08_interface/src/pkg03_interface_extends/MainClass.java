package pkg03_interface_extends;

public class MainClass {

  public static void main(String[] args) {
    
    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone)elec).call(); 
    ((SmartPhone)elec).game();; 
    
    Computer computer = new SmartPhone();
    computer.powerOn();
    computer.game();
    ((SmartPhone)computer).call();
    
    Phone phone = new SmartPhone();
    phone.call();
    ((SmartPhone)phone).game();
    
    SmartPhone smarphone = new SmartPhone();
    smarphone.powerOn();
    smarphone.game();
    smarphone.call();
    
  }

}
