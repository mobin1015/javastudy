package practice07_Fighter;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Fighter fighter1 = new Fighter("철수" , 100 );
    Fighter fighter2 = new Fighter("영희" , 100 );
    
    fighter2.punch(fighter1, 10);
    
    boolean myTurn = true;
    
    while(fighter1.isAlive()  && fighter2.isAlive()) {
      
      if(myTurn) {
        fighter2.punch(fighter1, 10);
      }else {
        fighter1.punch(fighter2, 10);
      }
      
      myTurn = !myTurn;
    }
  }

}
