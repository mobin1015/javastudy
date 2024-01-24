package practice02_Lotto;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {
  
  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
   * @return money   사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0       로또 구매 실패 시 반환
   */
  public int buyLotto() throws RuntimeException {
    
      Scanner sc = new Scanner(System.in);
    /* 여기에 구현 */
      
      System.out.println("금액 투입 >>>");
      int money = sc.nextInt();
  
      if (money <1000) {
        money =0;
        throw new RuntimeException("최소 구매 비용은 1000");
      }
      
      if (money >100000) {
        money=0;
        throw new RuntimeException("최대 구매 비용은 100000");
      }
      else {
        money = money - (money%1000);
      }
      return money;  // 리턴 값 바꿀 것
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를 생성하는 메소드<br>
   * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
   * @param money   로또 구매 비용
   */
  public List<String> generateLotto(int money) {
    
    /*
     * 예시) 5000원 구매
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     */
    /*
     * 예시) 10000원 구매
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     * 
     * 01 : 1  2  3  4  5  6
     * 02 : 1  2  3  4  5  6
     * 03 : 1  2  3  4  5  6
     * 04 : 1  2  3  4  5  6
     * 05 : 1  2  3  4  5  6
     */
    
    List<String> papers = new ArrayList<String>();
    
    /* 여기에 구현 */
    int num=1;
    for(int i=1; i <= money/1000; i++ ) {
      papers.add("0"+Integer.toString((num++)) + " : ");
      for(int j=0; j<5; j++) {
        papers.add(Integer.toString((int)(Math.random() *43 +1 )) + " " );
      }
      papers.add("\n");
   
      if(i%5==0) {
        papers.add("\n");
      }
      if(num>5) {
        num=1;
      }
    } 
       
    return papers;
    
  }
  
}