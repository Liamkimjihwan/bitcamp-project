package bitcamp.java89.ems;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");


  //1) 사용자로부터 값을 입력받기 위해 사용할 입력도구 준비!
  Scanner keyScan = new Scanner(System.in);

   String str = keyScan.nextLine();

   Teacher teacher = new Teacher(); // teacher 인스턴스 준비
  System.out.print("이름(예:홍길동)? ");
  teacher.name = str;

  System.out.print("성별? ");
  teacher.gender = str;

  System.out.print("나이? ");
  teacher.age = Integer.parseInt(str);

  System.out.print("경력(예:20년차)? ");
  teacher.career =str;

  System.out.print("능력? ");
  teacher.skill = str;

  System.out.print("전공? ");
  teacher.major = str;

  System.out.print("이메일(예:hong@test.com)? ");
  teacher.email = str;

  System.out.print("전화번호(예:010-1111-1111)? ");
  teacher.tel = str;

  System.out.printf("이름: %s\n", teacher.name);
  System.out.printf("성별: %s\n", teacher.gender);
  System.out.printf("나이: %d\n", teacher.age);
  System.out.printf("경력: %s\n", teacher.career);
  System.out.printf("능력: %s\n", teacher.skill);
  System.out.printf("전공: %s\n", teacher.major);
  System.out.printf("이메일: %s\n", teacher.email);
  System.out.printf("전화번호: %s\n", teacher.tel);



  }
}
