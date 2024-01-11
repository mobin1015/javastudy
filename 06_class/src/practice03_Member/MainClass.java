package practice03_Member;

public class MainClass {

  public static void main(String[] args) {
    
    // 임의의 정보를 가지는 Member 1명을 만들고, 정보 출력하기

    
    // 디폴트 형식 생성장 + setter
    // or
    // 필드를 이용한 생성자
    Contact contact = new Contact();
    Member member = new Member();
    Address address = new Address();
    
    contact.setMobile("010-5656-7989");
    contact.setTel("032-657-5471");
    
    member.setId("asd123");
    member.setAddress(address);
    member.setContact(contact);

    
    address.setBasicAddress(true);
    address.setDetailAddress("3층");
    address.setExtraAddress("없음");
    address.setJibunAddress("553-12");
    address.setPostCode("13145");
    address.setRoadAddress("조마루로");
  

    
    // 정보 출력 getter
    System.out.println("ID : " + member.getId());    
    System.out.println("전화번호 : " + member.getContact().getMobile());
    System.out.println("집전화 : " + member.getContact().getTel());
    System.out.println("지번주소 : " + member.getAddress().getJibunAddress() );
    System.out.println("상세주소 : " + member.getAddress().getDetailAddress());
    System.out.println("도로명주소 : " + member.getAddress().getRoadAddress());
    System.out.println("추가주소 : " + member.getAddress().getExtraAddress());
    System.out.println("우편주소 : " + member.getAddress().getPostCode());
    System.out.println("기본 주소 유무 : " + member.getAddress().isBasicAddress());
 

  }

}
