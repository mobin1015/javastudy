package pkg05_void_return;

public class test {

  public static void main(String[] args) {
    int max =0;
    int max2 =0; 
    int answer =0;
    int []numbers = new int[] {5,4,4,4,4};
    max = numbers[0];
    for(int i=0; i<numbers.length; i++){
        if(numbers[i] >max){
            max = numbers[i];
        }
        
    }
    max2 = numbers[0];
    int count=0;
      for(int i=0; i<numbers.length; i++){
        if(numbers[i] == max){
            count++;
        }
        
    }
    if (count >=2) {
      System.out.println(answer = max * max);
        
    }
    else{
      for(int i=0; i<numbers.length; i++){
        if(numbers[i] > max2 && numbers[i] < max){
            max2 = numbers[i];
        }
        
    }
      System.out.println(answer = max * max2);
    }
    
      

    

  }

}
