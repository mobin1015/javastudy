package practice03_club;

public class MainClass {

  public static void main(String[] args) {
    Club club = new Club();
    Person person = new Person("1");
    Person person2 = new Person("2");
    Person person3 = new Person("3");
    Person person4 = new Person("4");
    Person person5 = new Person("5");
   
    
    club.enterClub(person);
    club.enterClub(person2);
    club.enterClub(person3);
    club.enterClub(person3);
    club.enterClub(person3);
    club.enterClub(person4);
    club.enterClub(person5);
    club.enterClub(new Person("6"));
    club.enterClub(new Person("6"));
    
    club.leabeClub(person);
    
    club.poolList();

  }

}
