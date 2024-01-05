package pkg04_loop_practice;

public class MainClass {
  public static void method1() {
    
    // 100 ~ 1 출력하기
    int n = 100;
    while(n>0) {
      System.out.println(n--);
    }
  
    
  }
  
  public static void method2() {
    
    // 5 ~ 20 사이 모든 정수의 평균
    int n = 5;
    int n2= 20;
    double count = 0;
    double sum =0;
    while(n<n2+1) {
      sum += n;
      n++;
      count ++;
    }
    System.out.println(sum / count);
  }
  
  public static void method3() {
    // 3단 출력하기
    int dan = 3;
    for(int i=1; i<=9; i++) {
      System.out.printf("%d x %d = %d\n",dan,i,dan*i);
    }
  }
  
  public static void method4() {
    // 70원씩 모금하기
    // 목표는 100000원 이상
    
    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    //...
    // n회 모금액 100000원 이상 금액
    
    int charity = 70;
    int total = 0;
    int nth = 0;
    final int GOAL = 100_000; 
    while(total < GOAL) {
      total +=charity;
      nth++;
      System.out.println( nth + "회 모금액" + total + "원");
    }
    
  }
  
  public static void method5() {
    
    // 2x1=2
    // 2x2=4
    //...
    // 9x9=81
    int a=0;
    outer:
    for(int i=2; i<=9;i++) {
      for(int j=1; j<=9; j++) {
        System.out.println(i +" x "+ j + " = " + j*i);
        a=j;
        if(i*j == 25) break outer;
      } 
  
    }
    
  }
  
  public static void method6() {
    
    // 2x1=2 3x1=3 ... 9x1=9
    // 2x2=4 3x2=6 ... 9x2=18
    //..
    // 2x9=18 3x9=27 ... 9x9=81
    
    for(int i=1; i<=9;i++) {
      for(int j=2; j<=9; j++) {
        System.out.print(j +" x "+ i + " = " + i*j + "\t");
 
      } 
      System.out.println();
    }
  }
  
  public static void method7() {

    /*
     * 삼각별 출력하기-1
     *        star=12345 
     * row=1       * 
     * row=2       ** 
     * row=3       *** 
     * row=4       **** 
     * row=5       *****
     * 
     * row=1, star=1~1 
     * row=2, star=1~2 
     * row=3, star=1~3 
     * row=4, star=1~4 
     * row=5, star=1~5
     */
    for(int i=0; i<5; i++) {
      for(int j=0; j<i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
  }
  
  public static void method8() {
    
    /*
     * 삼각별 출력하기-2
     *        star=12345
     * row=1       *****
     * row=2       ****
     * row=3       ***
     * row=4       **
     * row=5       *
     * 
     * row=1, star=1~5
     * row=2, star=1~4
     * row=3, star=1~3
     * row=4, star=1~2
     * row=5, star=1~1
     */
    for(int i=0; i<5; i++) {
      for(int j=5; j>i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
  }
  
  public static void method9() {
    
    /*
     * 삼각별 출력하기-3
     * space/star=123456789
     * row=1          *
     * row=2         ***
     * row=3        *****
     * row=4       *******
     * row=5      *********
     * 
     * row=1, space=1~4, star=5~5
     * row=2, space=1~3, star=4~6
     * row=3, space=1~2, star=3~7
     * row=4, space=1~1, star=2~8
     * row=5, space=1~0, star=1~9
     */
    int a=0;
    for(int i=0; i<5; i++) {
      for(int j=4; j>i; j--) {
        System.out.print(" ");
      }
      
      for(int j=0; j<i+a+1; j++) {
        System.out.print("*");
       
      }a+=1;
      System.out.println();
    }
    
    

  }
  
  public static void method10() {
    
    /*
     * 삼각별 출력하기-4
     * space/star=123456789
     * row=1      *********
     * row=2       *******
     * row=3        *****
     * row=4         ***
     * row=5          *
     * 
     * row=1, space=1~0, star=1~9
     * row=2, space=1~1, star=2~8
     * row=3, space=1~2, star=3~7
     * row=4, space=1~3, star=4~6
     * row=5, space=1~4, star=5~5
     */
   
    int a=9;
    for(int i=0; i<5; i++) {
      for( int j=0; j<i; j++) {
        System.out.print(" ");
      }
      
      for(int j=9-i; j>i; j--) {
        System.out.print("*");
       
      }a-=1;
      System.out.println();
    }
    
  }  
  
 
  
  public static void main(String[] args) {
    method10();
  }

}
