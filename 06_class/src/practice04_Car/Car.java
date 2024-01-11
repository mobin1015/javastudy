package practice04_Car;

public class Car {
  
  //field
  private Driver driver;
  private int currSpeed;
  private int fuel;
  public final static int MAX_SPEED = 100; //static은 get메소드가 아닌 클래스명으로 호출 ex Car.MAX_SPEED
  
  public Car() {
    // TODO Auto-generated constructor stub
  }

  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrSpeed() {
    return currSpeed;
  }

  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  public void enginStart() {
    if(driver == null || fuel == 0) {
      System.out.println("시동 실패");
    } else {
      System.out.println("시동 성공");
    }
  }
  
  // 1초당 10씩 속도가 증가하는 accelerator (n : bestDriver는 10, 아니면 5)
  // 1초당  1씩 연료가 줄어드는 accelerator
  public void accelarator(int pushTime) {
    
    if(this.currSpeed == MAX_SPEED) {
      System.out.println("이미 최고 속도 입니다.");
      return;
    }
    
    if(fuel == 0) {
      System.out.println("연료가 없습니다.");
      return;
    }
    System.out.println(pushTime);
    if(pushTime <= 0) {
      System.out.println("accelerator를 잘 밟으세요.");
      return;
    }
  
    
    int n = (driver.isBestDriver() ? 10 : 5);
    this.currSpeed += (pushTime * n);
    System.out.println(n);
 
    this.currSpeed =Math.min(currSpeed,MAX_SPEED );
    
    
    fuel -= pushTime;
    fuel = Math.max(fuel, 0);
    
    System.out.println("현재 연료량 : " + fuel + ", 현재 속도 : " + this.currSpeed);
    
  }
  
  // 1초당 10씩 속도가 줄어드는 brake
  
  public void brake(int pushTime) {
    
    if(this.currSpeed == 0) {
      System.out.println("이미 멈춰있습니다.");
      return;
    }
    
    if(pushTime <= 0) {
      System.out.println("brake 를 잘 밟으세요.");
      return;
    }
    
    this.currSpeed -= (pushTime * 10);
    this.currSpeed = Math.max(currSpeed, 0);
    System.out.println("현재 연료량 : " + fuel + ", 현재 속도 : " + this.currSpeed);
    
    
  }
  
  


}
