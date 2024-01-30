package practice02_dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pkg03_dql.SampleDto;

public class MainClass {

  /*
   * TALK_T 테이블에 데이터를 TANK_NO의 내림차순으로 정렬한 뒤 11~20번째 행을 조회하여 List에 저장하시오
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

  
  public static void main(String[] args) {
      
      Connection con = null;
      PreparedStatement ps = null;
      ResultSet rs = null;
      
    try {
        
        Class.forName("oracle.jdbc.OracleDriver");
        
        String url = System.getProperty("jdbc.url");
        String user = System.getProperty("jdbc.user");
        String password = System.getProperty("jdbc.password");
        con = DriverManager.getConnection(url, user, password);
        
        String sql = "SELECT TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT "
            + "       FROM ( SELECT ROW_NUMBER() OVER(ORDER BY TALK_NO DESC) AS A, TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT "
            + "        FROM TALK_T )  "
            + "       WHERE A BETWEEN 11 AND 20   ";
       
        ps = con.prepareStatement(sql);
        
        TalkDto talkDto = null;
        
        // 쿼리문 실행
        rs = ps.executeQuery();
        
        // 결과를 저장할 SampleDto 객체 선언
        List<TalkDto> talkDtos = new ArrayList();
        
       
        // 결과 조회
        while(rs.next()) {
          talkDto = new TalkDto();
          talkDto.setTALK_NO(rs.getInt(1));
          talkDto.setTALK_CONTENT(rs.getString(2));
          talkDto.setTALK_EDITOR(rs.getString(3));
          talkDto.setWRITEN_AT(rs.getDate(4));
          talkDtos.add(talkDto);
        }
       
        for(int i=0; i<talkDtos.size(); i++) {
          System.out.println(talkDtos.get(i));
        }
        
      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        try {
          if(rs != null) rs.close();
          if(ps != null) ps.close();
          if(con != null) con.close();
        } catch (Exception e2) {
          e2.printStackTrace();
        } 
        
      }
      
    }

  }


