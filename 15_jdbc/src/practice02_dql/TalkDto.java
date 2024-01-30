package practice02_dql;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO
 * 1. Data Transfer Object
 * 2. 데이터베이스의 데이터를 자바와 주고 받을 때 사용하는 객체이다.
 * 3. 기본적으로 테이블 하나당 DTO 하나를 만든다.
 * 4. 필드는 칼럼에 매칭하고 생성자와 Getter/Setter 를 만든다.
 */

@ToString
@NoArgsConstructor    /* default constructor */
@AllArgsConstructor   /* constructor using field */
@Getter
@Setter
public class TalkDto {
  private int TALK_NO;
  private String TALK_CONTENT;
  private String TALK_EDITOR;
  private Date WRITEN_AT ;
}
