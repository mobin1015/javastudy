package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class MainClass {
  
  /*
   * java.io.FileOutputStream
   * 1. 바이트 기반의 파일 출력 스트림이다.
   * 2. 출력 단위
   *    1) int 
   *    2) byte[]
   */
  
  /*
   * java.io.BufferedOutputStream
   * 1. 버퍼링을 지원하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 출력 속도가 향상된다.
   */
  
  /*
   * java.io.DataOutputStream
   * 1. 자바 변수 값을 출력하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 타입 별로 전용 메소드가 존재한다. 
   */
  
  /*
   * java.io.ObjectOutputStream
   * 1. 객체를 출력하는 바이트 출력 스트림
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 객체를 출력 스트림으로 전송하기 위해 직렬화 과정(객체를 byte 배열로 변환)이 필요하다.
   * 4. 직렬화 방법
   *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다.(필수)
   *    2) long serialVersionUID 필드 값을 임의로 생성한다.
   */
  
  public static void method1() {
    
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.

    // 디렉터리
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    // 파일
    File file = new File(dir, "sample1.dat"); 
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {
    
      // 파일 출력 스트림 생성 (무조건 생성 모드)
      out = new FileOutputStream(file);
      
      // 출력할 데이터 
      int c = 'A';
      String str = "pple";
      byte[] b = str.getBytes();
      
      // 출력
      out.write(c);
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
     
      
      // 확인
      System.out.println(file.length() + "바이트 크기의" + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {

      try {
        // 파일 출력 스트림 닫기(종료) 이 친구는 무조건 실행 돼야 해서 finally에 넣음
        if(out != null)
        out.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
      
    }
  }

  public static void method2() {
    
    // 추가 모드 : 기존에 파일이 없으면 새로 만들고 있으면 내용만 추가한다.
    
    // 디렉터리
    File dir = new File("\\storage");
    
    // 파일
    File file = new File(dir, "sample2.dat");
    FileOutputStream out = null;
    try {
      // 추가 모드, FileOutputStream 객체 생성시 두번째 매개변수에 true 넣기
      out =   new FileOutputStream(file, true);
     String c = "안녕하세요 반갑습니다\n";
     byte [] a = c.getBytes();
      out.write(a);
      out.flush();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(out != null) 
          out.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "smaple3.dat");
  

  // 버퍼 출력 스트림 선언 
  BufferedOutputStream out = null;
  
 
  

  try {
    
    // 버퍼 출력  
    out = new BufferedOutputStream(new FileOutputStream(file));
    
    // 출력할 데이터
    String str1 = "how do you do? nice to meet you\n";
    String str2 = "i'm fine thank you\n";
    
    // 출력
    out.write(str1.getBytes());
    out.write(str2.getBytes());
    
    // 버퍼 출력 스트림 닫기
    out.close();
    
    
    // 확인
    System.out.println(file.length() + "바이트 크기의" + file.getPath() + " 파일이 생성되었습니다.");
    
    
  } catch(Exception e) {
    e.printStackTrace();
  }
  }
  
  public static void method4() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir,"sample4.dat");
    
    DataOutputStream out = null;
    
    try {
      out = new DataOutputStream(new FileOutputStream(file));
      
      String name = "홍길동";
      int age = 10;
      double height = 140.5;
      boolean isAdult = (age >= 20);
      char gender = '남';
      
      // 출력
      out.writeUTF(name);
      out.writeInt(age);
      out.writeDouble(height);
      out.writeBoolean(isAdult);
      out.writeChar(gender);
      
      out.flush();
      
      // 데이터 출력 스트림 닫기
      out.close();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의" + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void method5() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "sample5.dat");
    
    // 객체 출력 스트림 선언
   ObjectOutputStream out = null; 
   
   try {
     
     // 객체 출력 스트림 생성
     out = new ObjectOutputStream(new FileOutputStream(file));
     
     // 출력할 개체 
     Employee employee = new Employee(1, "홍길동");
     List<Employee> employees = Arrays.asList(new Employee(2, "홍길순"), new Employee(3, "홍순자"));
     
     // 객체 출력
     out.writeObject(employee);
     out.writeObject(employees);
     
     out.close();
     // 확인
     System.out.println(file.length() + "바이트 크기의" + file.getPath() + " 파일이 생성되었습니다.");
     
     
  } catch (Exception e) {
    e.printStackTrace();
  }
  }
  
  public static void main(String[] args) {
    method4();
    
  }
  
  public static void practice1() {
    
    // FileOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기(system.nanotime)
    File dir = new File("\\storage");
    
    File file = new File(dir, "NationalAnthem.dat");
    
    FileOutputStream out = null;
    
    try {
      out = new FileOutputStream(file);
      
      String nationalAnthem = "동해물과 백두산이 마르고 닳도록";
      long start = System.nanoTime();
      out.write(nationalAnthem.getBytes());
      long end = System.nanoTime();
      
      System.out.println("수행시간 : " + ( end - start));
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  }
  
  public static void practice2() {
    
    // BufferedOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기
    
    File dir = new File("\\storage");
    
    File file = new File(dir, "NationalAnthem2.dat");
    
    BufferedOutputStream out = null;
    
    try {
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      String nationalAnthem = "동해물과 백두산이 마르고 닳도록";
      long start = System.nanoTime();
      out.write(nationalAnthem.getBytes());
      long end = System.nanoTime();
      
      System.out.println("수행시간 : " + ( end - start));
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void practice3() {
    
    File dir = new File("\\storage");
    
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "test.txt");
    BufferedOutputStream out = null;
    
    try {
      out = new BufferedOutputStream(new FileOutputStream(file));
      String a = "test";
      out.write(a.getBytes());
      out.flush();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
    
  }

}
