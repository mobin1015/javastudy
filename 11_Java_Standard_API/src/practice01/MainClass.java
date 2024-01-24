package practice01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.UUID;

public class MainClass {

  public  static void method1() {
    
    // 파일명 만들기
    // 형식 : 하이픈이 제거된 UUID + 밑줄 + 타임스탬프.확장자
    
    String filename = "박모빈.txt";

    String mapping = filename.substring(filename.lastIndexOf("."));
    
    // 방법1
    StringBuilder builder = new StringBuilder();
    builder.append(UUID.randomUUID().toString().replace("-", ""));
    builder.append("_");
    builder.append(System.currentTimeMillis());
    builder.append(mapping);
    System.out.println(builder.toString());
    
    // 방법2
    UUID uuid1 = UUID.randomUUID();
    String result1 = uuid1.toString();
    long timestamp = System.currentTimeMillis();
    System.out.println(result1.replace("-", "") + "_" + timestamp+ mapping);
    
  }
  
  public  static Map<String, Object> method2(String id) {
    
    // 나이 구하기 + 성별 구하기
    // 나이 : 현제년도 - 태어난년도
    // 성별 : 하이픈 뒤의 숫자가 1,3이면 남자 , 2,4이면 여자

    // 현재 년도
    int nowYear = LocalDate.now().getYear();
    
    // 태어난 년도
    int birthYear = 0;
    
    // 하이픈 뒤의 숫자
    int afterHyphen = Integer.parseInt(id.substring(7,8));
    switch(afterHyphen) {
    
    case 1 :
    case 2 : 
      birthYear = 1900 + Integer.parseInt(id.substring(0,2));
      break;
    case 3 :
    case 4 :
      birthYear = 2000 +  Integer.parseInt(id.substring(0,2));
      break;
     
    
    }
    
    String [] genders = {"여자", "남자"};
        
   return Map.of("age", nowYear - birthYear, 
                 "gender", genders[afterHyphen%2]);
    
  }
  
  public  static Map<String, Object> method2_2(String id) {
    

    Date date1 = new Date();
    SimpleDateFormat  sdf = new SimpleDateFormat("yy-MM-dd");
    String cDate =sdf.format(date1).toString();
    String pDate = id.substring(id.indexOf("-"));
    int gender = Integer.parseInt(id.substring(id.indexOf("-")+1));
    String gender0 ="";
    int age = (Integer.parseInt(cDate.substring(0,2)) - Integer.parseInt(pDate.substring(0,2))) > 0 
        ? Integer.parseInt(cDate.substring(0,2)) - Integer.parseInt(pDate.substring(0,2)) : 
          100 - (Integer.parseInt(pDate.substring(0,2))-Integer.parseInt(cDate.substring(0,2))) ;
    
    switch(gender) {
      case 1  :
        gender0="man";
        break;
      case 3 :
        gender0="man";
        break;
      case 2 :
        gender0="woman";
        break;
      case 4 :
        gender0="woman";
        break;
    }
    
  
    
 

       

    
    
    return null;
    
  }
  
  public static void method3() {
    
    // 각 나라별 수도 맞히기
    
    // 프랑스 수도는? >>> 
    // 파리
    // 스위스 수도는? >>> 
    // 베른
    // 영국 수도는? >>> 
    // 런던
    // 독일 수도는? >>> 
    // 베를린
    // 이탈리아 수도는? >>> 
    // 로마
    // 5개 정답 성공
    
    
    
    Map<String, String> map = Map.of("프랑스", "파리"
                                   , "독일", "베를린"
                                   , "이탈리아", "로마"
                                   , "스위스", "베른"
                                   , "영국", "런던");
    
   
    int count =0;
    Scanner sc = new Scanner(System.in);
    
   for(Entry<String, String> entry : map.entrySet()) {
     System.out.println(entry.getKey() + "수도는? >>>");
     String answer = sc.next();
     if(answer.trim().equals(entry.getValue())){
       count++;
     }
  }
   System.out.println(count + "개 정답 성공");
   sc.close(); 
  }
  
  public static void method4() {

    // 5000원이 있는 통장(balance)에서 랜덤하게 출금하기
    // 실행예시)
    // 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
    // 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
    // 출금 전 122원, 3회 출금액 102원, 출금 후 20원
    // 출금 전 20원, 4회 출금액 2원, 출금 후 18원
    // 출금 전 18원, 5회 출금액 17원, 출금 후 1원
    // 출금 전 1원, 6회 출금액 1원, 출금 후 0원
    
    double num ;
    int balance =5000;
    int count =0;
    
    while(balance >0) {
      count++;
      System.out.printf("출금 전 %4d원, %d회 출금액 ",balance,count);
      num = Math.random() *balance;
      balance -= num;
      System.out.printf( "%4d원, 출금 후  %4d원\n",(int)num,balance);
      
    }

    
  
  }
  
  public static void method5() {

    // 윷놀이
    // 실행예시1) "도", 1칸 이동한다.
    // 실행예시2) "개", 2칸 이동한다.
    // 실행예시3) "걸", 3칸 이동한다.
    // 실행예시4) "윷", "도", 5칸 이동한다.
    // 실행예시5) "모", "윷", "도", 10칸 이동한다.
    
    String[] yuts = {"", "도", "개", "걸", "윷", "모"};
    
    // 방법1
//    StringBuilder builder = new StringBuilder();
//    int move =0;
//    int totalMove = 0;
//    do {
//      move= (int)(Math.random() * +1);
//      totalMove += move;
//      builder.append(yuts[move]);
//      builder.append(", ");
//      
//    }
//    
    
    // 방법2
    int move=0 ;
    
    Outerloop:
    while(true)  {
      double rand = Math.random()*6;
      int turn = (int)rand;
    switch(turn) {
    case 0:
      System.out.print("\""+"꽝" +"\", ");
      break Outerloop;
    case 1:
      move +=1;
      System.out.print("\""+yuts[turn] + "\", ");
      break Outerloop;
    case 2:
      move +=2;
      System.out.print("\""+yuts[turn] + "\", ");
      break Outerloop;
    case 3:
      move+=3;
      System.out.print("\""+yuts[turn] + "\", ");
      break Outerloop;
    case 4:
      move+=4;
      System.out.print("\""+yuts[turn] + "\", ");
      break;
    case 5:
      move+=5;
      System.out.print("\""+yuts[turn] + "\", ");
      break;
    }
    }
    System.out.println(move +"칸 이동한다.");
  }

  public static void method6() {
    
    // SecureRandom을 이용해 "대문자+소문자+숫자"로 구성된 임의의 인증번호 만들기
    // 실행예시1)
    //   몇 자리의 인증번호를 생성할까요? >>> 4
    //   생성된 4자리 인증번호는 7W5e입니다.
    // 실행예시2)
    //   몇 자리의 인증번호를 생성할까요? >>> 6
    //   생성된 6자리 인증번호는 Fa013b입니다.
    
    System.out.println("몇 자리의 인증번호를 생성할까요?");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    StringBuilder builder;
    double rand[] = new double[3];
    double idx ;
    boolean x,y,z ;    
    while(true) {
      builder = new StringBuilder();
      x = false ; 
      y = false;
      z = false;
    for(int i=0; i <num; i++) {
       rand[0] = Math.random()*25 +65;
       rand[1] = Math.random()*25 +97;
       rand[2] = Math.random()*10;
       idx = Math.random()*3;
       int a =(int)rand[(int) idx];
       if( a< 11){
         builder.append(a);
       }else {
         builder.append((char)a);
       };    
    }
    
    
    for(int i=0; i< num; i++) {
      if((int)builder.charAt(i) > 64 && (int)builder.charAt(i) < 91){
        x =true;
      }
      if((int)builder.charAt(i) > 97 && (int)builder.charAt(i) < 123){
        y =true;
      }
      if((int)builder.charAt(i) >= 0 && (int)builder.charAt(i) < 11){
        z = true;
      }
    }
 
    if((x =true) && (y = true)  && (z=true)) {
      break;
    }
    }
    
     System.out.println(builder);
  }

  public static void method7() {

    // UpDown 게임
    // 컴퓨터가 1 ~ 10000 사이의 난수를 발생시킨다.
    // 사용자는 해당 난수를 맞힌다.
    // 실행예시)
    // 입력 >>> 5000
    // Down!
    // 입력 >>> 2500
    // Up!
    // ...
    // 입력 >>> 4500
    // 정답입니다. 총 5번만에 성공했습니다.
    
    double rand = Math.random() *10000 +1;
    int num= (int)rand;
    int count =0;
    Scanner sc = new Scanner(System.in);
    int inPut;
    System.out.println("숫자를 맞춰보세요.");
    while(true) {
      System.out.println("입력 >>>");
      inPut= sc.nextInt();
      
      if(inPut > num ) {
        count ++;
        System.out.println("DOWN!");
      }
      else if(inPut < num ){
        count ++;
        System.out.println("UP!");
      }
      else {
        System.out.printf("정답입니다. 총 %d만에 성공했습니다." , count);
        break;} 
     
      
    }
    sc.close();
    
  }

  public static void method8() {

    // 0~9 사이 난수를 100개 발생시키고 발생한 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
    // 실행예시)
    // 0 : #### 4
    // 1 : ############ 12
    // 2 : ############ 12
    // 3 : ##### 5
    // 4 : ######## 8
    // 5 : ########### 11
    // 6 : ############ 12
    // 7 : ################## 18
    // 8 : ####### 7
    // 9 : ########### 11
     int a;
     int b[] = new int[10];
    for(int i=0; i< 100; i++) {
      double random = Math.random() * 10;
      a = (int)random;
      switch(a) {
      case 0:
        b[0] ++;
        break;
      case 1:
        b[1] ++;
        break;
      case 2:
        b[2] ++;
        break;
      case 3:
        b[3] ++;
        break;
      case 4:
        b[4] ++;
        break;
      case 5:
        b[5] ++;
        break;
      case 6:
        b[6] ++;
        break;
      case 7:
        b[7] ++;
        break;
      case 8:
        b[8] ++;
        break;
      case 9:
        b[9] ++;
        break;
      }
    }
    
    for(int i=0; i<10; i++) {
      System.out.print(i +" : ");
      for(int j=0; j<b[i]; j++) {
        System.out.print("#");
      }
      System.out.println(" " +b[i]);
    }
    
    
  }
  
  public static void method9() {
    
    // 5 x 5 숫자 빙고판 자동 생성
    //
    // 지시사항)
    //   1. 1 ~ 25 사이 정수를 2차원 배열 bingo 에 순차적으로 넣는다.
    //      1  2  3  4  5
    //      6  7  8  9 10
    //     11 12 13 14 15
    //     16 17 18 19 20
    //     21 22 23 24 25
    //   2. 25번 서로 섞는다.
    //      순차적으로        랜덤하게
    //      모든요소접근      접근
    //      ----------------------------
    //      bingo[0][0]  <->  bingo[1][4]
    //      bingo[0][1]  <->  bingo[0][2]
    //      bingo[0][2]  <->  bingo[2][1]
    //      ...
    //      bingo[4][4]  <->  bingo[3][1]
    //
    // 실행예시)
    //  10  9  4 25  2
    //  15  3 13 21  1
    //  14 20 11 19  6
    //   8 17  5 12  7
    //  16 22 18 24 23
    
    int [][]a= new int[5][5];
    int num=1;
    int temp;
    int x;
    int y;
    for(int i=0; i<5; i++) {
      for(int j=0; j<5; j++) {
        a[i][j] = num++; 
      }
    }
    
    for(int i=0; i<5; i++) {
      for(int j=0; j<5; j++) {
        x =(int)(Math.random()*5);
        y =(int)(Math.random()*5);
        
        temp = a[i][j]; 
        a[i][j] = a[x][y];
        a[x][y] = temp;
        
      }
    }
    
    for(int i=0; i<5; i++) {
      for(int j=0; j<5; j++) {
        System.out.printf("%3d",a[i][j]);
      }
      System.out.println();
    }
  }
  
  
  public static void main(String[] args) {
    
//    Map<String, Object> map = method2("140101-4123456");
//    
//    for(Entry<String, Object> entry : map.entrySet()) {
//      System.out.println(entry.getKey() + ": " + entry.getValue());
//    }
    
    // map을 for문으로 돌려서 확인하기
     method9(); 
     

   }

}
