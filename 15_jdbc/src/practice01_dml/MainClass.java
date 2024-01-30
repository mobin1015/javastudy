package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass {
  
  /*
   * TALK_T 테이블에 데이터를 1행씩 삽입하시오.
   * TALK_T 구조
   *    TALK_NO       NUMBER (PK)
   *    TALK_CONTENT  VARCHAR2(1000 BYTE)
   *    TALK_EDITOR   VATCHAR2(1000 BYTE)
   *    WRITEN_AT     TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP)
   *    
   * DB 서버 환경
   *    192.168.0.214
   *    GD/1111
   */

  public static void method1() {
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      // oracle.jdbc.OracleDriver 클래스 로드
      Class.forName("oracle.jdbc.OracleDriver");
      
      // 데이터베이스 접속 정보
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);
      
      // 쿼리문 
      String sql = "UPDATE TALK_T SET WRITEN_AT = CURRENT_TIMESTAMP WHERE TALK_NO=3 ";
        
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);

      // 쿼리문 실행. 삽입된 행의 개수가 반환됨.
      int result = ps.executeUpdate();
      System.out.println(result + "행 이(가) 삽입되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Connection, PreparedStatment 객체 닫기(반환)
      try {
        if(con != null) con.close();
        if(ps != null) ps.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) {
    method1();
  }
}
