package pkg03_one_practice;


public class MainClass {
  
  public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month =11;
    String[] season = new String[] {"겨울","봄","여름","가을"} ;
 
    /*  month      month % 12   month % 12 / 3
     *  12 ~ 2     0 ~ 2        0
     *  3 ~ 5      3 ~ 5        1
     *  6 ~ 8      6 ~ 8        2
     *  9 ~ 11     9 ~ 11       3
     */
    // 코드 한 줄만 추가할 것
    System.out.println(season[month % 12 /3]);

  }
  
  public static void method2() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 4;    // nDay일 후
    String[] weekName = new String[] {"일","월","화","수","목","금","토"};  // 요일 (월~일)
    
    // day의 nDay일 후
    day += nDay;

    // 코드 한 줄만 추가할 것
    System.out.println(weekName[day % 7]);
  }
  
  public static void method3() {
    
    char[] Letters = new char[26] ;
    
    char ch = 'a';
    
    for(int i=0; i<Letters.length; i++) {
      Letters[i] = ch ++;
    }
    for(int i=0; i < Letters.length; i++) {
      System.out.println(Letters[i]);
    }
    
  }
  
  public static void method4() {
    
    // 배열 a의 마지막 3개 요소 배열 b의 값으로 수정
    int[] a = new int[] {10, 20, 30, 0, 0, 0,};
    int[] b = new int[] {40, 50, 60};
    
    for(int i=0; i<b.length; i++) {
      a[i+3] = b[i];
    }
    for(int i=0; i<a.length; i++) {
      System.out.println(a[i]);
    }
    
    /*
     * 배열 복사를 위한 자바 표준 API
     * System.arraycopy(b, 0, a, 3, b.length) 
     * 1) 복사시작요소   : b[0] 요소를 a[3] 요소로 복사
     * 2) 복사할요소개수 : b.length개 복사
     */ 
    
   
  }
  
  public static void method5() {
    
    // 10진수를 2진수로 변환하기
    
    // 10진수
    int number = 35;

    // 2진수                       
    int[] binary = new int[10];    
                                  
    
    int i=0;
    while(number>0) {
      binary[i++]=number %2;
      number /=2;
      
      for(int j =i -1; j>=0; j--) {
        System.out.print(binary[j]);
      }
      
    }
    
//    for(int i=binary.length-1; i>=0; i--) {
//      System.out.print(binary[i]);
//    }
//    
    
  }
  
  public static void main(String[] args) {
    method5();
  }

}
