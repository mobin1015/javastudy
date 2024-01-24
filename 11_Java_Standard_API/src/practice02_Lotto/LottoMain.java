package practice02_Lotto;


import java.util.List;

public class LottoMain {

  public static void main(String[] args) {
    
      try {
      
      Lotto lotto = new Lotto();
      
      List<String> papers = lotto.generateLotto(lotto.buyLotto());
      
      for(int i = 0, size = papers.size(); i < size; i++) {
      System.out.printf("%3s",papers.get(i)); }
      
      } catch (Exception e) { System.out.println(e.getMessage()); }
     

  }

}