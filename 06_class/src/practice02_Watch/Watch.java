package practice02_Watch;

  public class Watch {
   private int hour;
   private int minute;
   private int second;
  
   
  public Watch(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  

  
  public void addHour(int a) {
    if(a <= 0) { return;}
    this.hour += a;
      
  }
  

  public void addMinute(int a) {
    if(a <= 0) { return;}
    
   this.minute += a;
 
 }


  public void addSecond(int a) {
    if(a <= 0) { return;}
    this.second +=a ;
  }
  
  public void see() {
    
    if(second >= 60) {
      minute += second /60; 
      second = second % 60;
    }
    if(minute >= 60) {
      hour += minute /60; 
      minute = minute % 60;
    }
    if(hour >= 24) {
      hour = hour %24; 
 
    }
   
    System.out.println(String.format("%02d:%02d:%02d",hour, minute, second));
  }         


}
