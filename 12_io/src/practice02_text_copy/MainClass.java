package practice02_text_copy;
import java.io.File;
public class MainClass {
  public static void main(String[] args) {
      
      File file = new File("\\storage\\A\\sample2.txt");
      File file2 = new File("\\storage\\sample2.txt");
    
      MyFileUtils.fileCopy(file, file2);
//    MyFileUtils.fileMove(file, file2);
  }
}
