package practice04_Car;

public class test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int hap =0;
    int max =0;
    int answer =0;
    int count =0;
    int []sides = {1,2,3 };
    for(int i=0; i<sides.length; i++ ){
        if(sides[i] > max){
            max=sides[i];
        }
    }
      for(int i=0; i<sides.length; i++ ){
        if(sides[i] <= max){
            
            hap +=sides[i];
        }
        if(sides[i] == max) {
          count ++;
        }
    }
    if(count >1) { hap -= max;}
    
    if(hap > max ){
        answer =1;
    }else {
    answer =2;
    }
    System.out.println(answer);
  }

}
