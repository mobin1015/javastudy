package practice03_Bus;

public class Bus {
  private Seat [] seats = new Seat[25] ;
  private int idx=0 ;
  
  public Bus() {
    // TODO Auto-generated constructor stub
  }
  
  public void seating(Person person) {
    Seat seat = new Seat(person);
        
    if(idx > 24) {
      System.out.println("자리가 다 찼습니다");
      return;
    }
    seats[idx++] = seat;
    System.out.println(person.getName() + "님 탑승");
    System.out.println("현재 인원 : " + idx + "명, 앞으로 " +  (seats.length - idx) +"명 탑승가능");
   
  }
  

}
