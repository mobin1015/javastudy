package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;

public class MyFileUtils {
  
  public static void fileCopy(File src, File dest) {
    
  
    
    try(
        BufferedReader in = new BufferedReader(new FileReader(src)); 
        BufferedWriter out = new BufferedWriter(new FileWriter(dest)))
    {
    
    char[] cbuf = new char[256];
    int readChar = 0;
    
    while((readChar = in.read(cbuf))!=-1) {
      out.write(cbuf,0,readChar );
    }
    
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  
  public static void fileMove(File src, File dest) {
    fileCopy(src, dest);
    src.delete();
    
    
  }

}
