package practice04_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  // field
  private List<Seat> seats = new ArrayList<>();
  private static final int SEATLIMIT = 25;
  private int numOfPerson;
  
  // constructor
  public Bus() {
    
    for(int i = 0; i <= SEATLIMIT; i++) {
      seats.add(new Seat());
    }
  }
  
  // method
  
  // 버스 타기(앞 자리부터 채우는 방식으로 앉기)
  public void on(Person person) throws RuntimeException {
    if(numOfPerson >= SEATLIMIT) {
      throw new RuntimeException("만석입니다. 버스에 탈 수 없습니다.");
    }
    for(int i = 0; i <= SEATLIMIT; i++) {
      Seat seat = seats.get(i);
      if(seat.getPerson() == null) {        
        seat.setPerson(person);
        numOfPerson++;
        break;
      }
    }
  }
  
  // 버스 내리기
  public void off(int seatNo) throws RuntimeException {
    if(seatNo <= 0 || seatNo > SEATLIMIT) {
     throw new RuntimeException("좌석 번호가 잘못 전달되었습니다.");
    }
//    seats.set(seatNo-1, new Seat());
    seats.get(seatNo-1).setPerson(null);
    numOfPerson--;
  }
  
  // 버스 탑승 명단
  public void info() {
    System.out.println("===== 탑승자 목록 확인 =====");
    for(int i = 0; i <= SEATLIMIT; i++) {
      // 각 좌석에 앉아 있는 사람
      Person person = seats.get(i).getPerson();
      if(person == null) {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어 있음");
      } else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + person.getName());
      }
    }
  }
  
}