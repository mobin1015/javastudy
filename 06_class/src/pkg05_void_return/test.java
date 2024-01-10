package pkg05_void_return;

public class test {

  public static void main(String[] args) {
    int[] answer = new int[15];
    int n =10;
    int a=1;
    for(int i=1; i<=n; i++){
       if(i % 2==1) {
          answer[i-a] = i;
           a +=2;
       }
     }
   
   int temp;
   for(int i=0; i<answer.length; i++){
   for(int j=0; j<answer.length-1; j++){
     if(answer[j] > answer[j+1]){
        temp = answer[j];
        answer[j] = answer[j+1];
        answer[j+1] = temp;
     }
   }
 
 
}

for(int c :answer) {
  System.out.println(c);
}

}

}
