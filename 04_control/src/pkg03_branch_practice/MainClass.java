package pkg03_branch_practice;

public class MainClass {

  public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 9;
        
    String season ;
    
    int mod = month % 12;
    
    if(mod <= 2) {
      season= "겨울";
    }else if(mod <=5) {
      season= "봄";
    }else if(mod  <= 8) {
      season= "여름";
      
    } else {
      season= "가을";   
    }
    
    System.out.println(season);
  }
  
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 70;  // 점수
    int grade = 5;   // 학년
//    if(grade > 0 && grade <4) {
//     if(score >=60) {
//       System.out.println("합격");     }
//     else {
//       System.out.println("불합격");
//     }
//      
//    }else {
//      if(score >=70) {
//        System.out.println("합격");     }
//      else {
//        System.out.println("불합격");
//      }
//    }
    
    // 합격 점수
    int pass = 0;
    if(grade >=1 && grade <=3) {
      pass = 60;
    } else if(grade >=4 && grade <=6) {
      pass = 70;
    }
    
    // 합격/불합격
    String result = null;
    if(score >= pass) {
      result = "합격";
    }else {
      result = "불합격";
    }
    System.out.println(result);
    
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
      weekName ="토요일";
    }else if(nDay%7==3) {
      weekName ="일요일";
    }else if(nDay%7==4) {
      weekName ="월요일";
    }else if(nDay%7==5) {
      weekName ="화요일";
    }else if(nDay%7==6) {
      weekName ="수요일";
    }
    System.out.println(weekName);
    
    
  }
  
  public static void method4() {
    // 메뉴에 따른 가격
    // 아메리카노 : 1000
    // 카페라떼   : 2000
    // 밀크티     : 3000
    // 기타       : 5000
    
    String order = "녹차";
    int price = 0;

    
    switch(order) {
    case "아메리카노":
      price = 1000;
      break;
    case "카페라떼":
      price = 2000;
      break;
    case "밀크티":
      price = 3000;
      break;
      
    default:
      price = 5000;
     
  }
    System.out.printf("주문하신 음료는 %s이고 가격은 %d원입니다.",order,price);
  }
  
  public static void main(String[] args) {
    method4();
  }

}