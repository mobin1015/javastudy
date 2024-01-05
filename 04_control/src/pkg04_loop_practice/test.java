package pkg04_loop_practice;

public class test {

  public static void main(String[] args) {
    int [] array = {5,4,3,2,1};
    int temp = 0;
    for(int i=0; i<array.length; i++){
      for(int j=0; j<array.length-1; j++){
          if(array[j] > array[j+1]){
             temp = array[j];
             array[j] = array[j+1];
             array[j+1] = temp;
          }
      }
      
      
  }
    
    for(int i=0; i<array.length; i++) {
      System.out.print(array[i]);
    }
    
  }

}
