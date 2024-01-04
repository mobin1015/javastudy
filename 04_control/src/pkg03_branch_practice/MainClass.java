package pkg03_branch_practice;

public class MainClass {

  public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 4;
    if(month>0 && month <3) {
      System.out.println("겨울");
    }else if(month<6) {
      System.out.println("봄");
    }else if(month<9) {
      System.out.println("여름");
      
    }else if(month<12) {
      System.out.println("가을");
    }else {
      System.out.println("겨울");   
    }
    
    
  }
  
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 70;  // 점수
    int grade = 5;   // 학년
    if(grade > 0 && grade <4) {
     if(score >=60) {
       System.out.println("합격");     }
     else {
       System.out.println("불합격");
     }
      
    }else {
      if(score >=70) {
        System.out.println("합격");     }
      else {
        System.out.println("불합격");
      }
    }
    
    
  }
  
  public static void method3() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 20;    // nDay일 후
    String weekName="";  // 요일 (월~일)
    if(nDay%7==0) {
      weekName = "목요일";
      
    }else if(nDay%7==1) {
      weekName ="금요일";
    }else if(nDay%7==2) {
      weekName ="토";
    }else if(nDay%7==3) {
      weekName ="일";
    }else if(nDay%7==4) {
      weekName ="월";
    }else if(nDay%7==5) {
      weekName ="화";
    }else if(nDay%7==6) {
      weekName ="수";
    }
    System.out.println(weekName);
    
    
  }
  
  public static void main(String[] args) {
    method3();
  }

}