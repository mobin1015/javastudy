package practice07_Fighter;

public class Fighter {

  private String name;
  private int hp;
  
  public Fighter(String name, int hp) {
    super();
    this.name = name;
    this.hp = hp;
  }

  
  // punch() 메소드 만들기

  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHp() {
    return hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public boolean isAlive() {
    return hp > 0;
  }
  
//  public void punch(Fighter a, int b) {
//    
//    if(b <= a.getHp()) {
//      a.setHp(0);
//    }else {
//      a.hp -= b;
//    }
//    
//    System.out.println(this.name + "의 펀치");
//    System.out.println(this.name + "의 HP: " + a.hp + " " + a.name + "의 HP: " + a.hp);

//  }
  
  public void punch(Fighter other, int power) {
    System.out.println(name + "의 펀치");
    if(power >= other.getHp()) {
      other.setHp(0);
    } else {
      other.setHp(other.getHp() - power);
    }
    System.out.println(name + "의 hp : " + hp + ", " + other.getName() + "의 hp : " + other.getHp());
  }
  


}
