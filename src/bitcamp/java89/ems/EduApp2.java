package bitcamp.java89.ems;
import java.util.Scanner;
public class EduApp2 {
  static Teacher[] teachers = new Teacher[100]; //★ teacher 100개를 담을 레퍼런스
  static int length = 0; // ★ 레퍼런스 배열 (Teacher[] teacher)에 몇명의 강사 정보를 저장했는지 개수를 지정한다.
  static Scanner keyScan = new Scanner(System.in);
// 클래스 변수로 만들기 위해서는 static 붙여서, 이 클래스 변수는 다른 static 메서드에서 공유할 수 있게 됨
  public static void main(String[] args) {
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");


    // 여러명의 강사 정보를 입력하기 위한 레퍼런스 배열을 만든다.
    // 배열로 데이터를 다루면 확장성이 없음..
          // 레퍼런스 배열에 몇 개의 Teacher 인스턴스가 들어있는지 그 개수를 보관한다.


  // 반복해서 입력 받는다.
 // 주소 없음을 의미한다.
// loop while 문 앞에 라벨 붙이면 bresk loop 했을 때 loop를 나갈 수 있다.
// 그냥 break만 했을 때는 while 문만 나갈 수 있음.
  loop :while (true) {
    System.out.print("명령 > ");
    // String command = keyScan.nextLine(); // 명령창 띄우기
    // keyScan.nextLine()가 리턴한 값은 스트링 값. 스트링 주소로 호출, 따라서!
    String command = keyScan.nextLine().toLowerCase(); // 이렇게 줄일 수 있음.
    // 문자열에 대해 사용할수 있는 연산자 = 인스턴스 문자열

    switch (command) {
      case "add": doAdd(); break; // => 따로 필요가 없다. 공유할거기 때문에
      case "list": doList(); break;//☆ 에 있는 teachers list를 처리하라는 뜻.
         // printteacherlist가 끝나면 그만둬라.
      case "view": doview(); break;
      case "quit":
        System.out.println("Good-bye");
        break loop;
     default:
       System.out.println("지원하지 않는 명령어입니다.");
    }
  }
}


    static void doList() { // 공유할거기 때문에 파라미터 없어도 됨. static이기 때문에 static 변수 공유
      for (int i = 0; i < length; i++) {
        Teacher teacher = teachers[i];
        System.out.printf(" %s,%s,%d,%s,%s,%s,%s,%s\n",
        teacher.name,
        teacher.gender,
        teacher.age,
        teacher.career,
        teacher.skill,
        teacher.major,
        teacher.email,
        teacher.tel);
}
}
static void doAdd() {

  while (length < teachers.length) {
   Teacher teacher = new Teacher(); // 반복문이 돌때마다 새로 생성됨.
    System.out.print("이름(예:홍길동)? ");
     teacher.name = keyScan.nextLine();

    System.out.print("성별? ");
     teacher.gender = keyScan.nextLine();

    System.out.print("나이? ");
     teacher.age = Integer.parseInt(keyScan.nextLine());

    System.out.print("경력(예:20년차)? ");
     teacher.career = keyScan.nextLine();

    System.out.print("능력? ");
     teacher.skill = keyScan.nextLine();

    System.out.print("전공? ");
     teacher.major = keyScan.nextLine();

    System.out.print("이메일(예:hong@test.com)? ");
     teacher.email = keyScan.nextLine();

    System.out.print("전화번호(예:010-1111-1111)? ");
     teacher.tel = keyScan.nextLine();

   teachers[length++] = teacher; // length 현재 값을 두는 것. 0은 변하지않음.
   System.out.print("계속 입력하시겠습니까(y/n)?");
   if (!keyScan.nextLine().equals("y")) // 키스캔에 입력된 값이 y와 같지않다면 if문 실행
     break;
   }

}

static void doview() {

  System.out.println("조회할 강사 이름은? ");
  String name = keyScan.nextLine().toLowerCase();
  for (int i = 0; i < length; i++) { // i번째
    if (teachers[i].name.toLowerCase().equals(name)) {
      System.out.printf("이름: %s\n", teachers[i].name);
      System.out.printf("성별: %s\n", teachers[i].gender);
      System.out.printf("나이: %d\n", teachers[i].age);
      System.out.printf("경력: %s\n", teachers[i].career);
      System.out.printf("능력: %s\n", teachers[i].skill);
      System.out.printf("전공: %s\n", teachers[i].major);
      System.out.printf("이메일: %s\n", teachers[i].email);
      System.out.printf("전화번호: %s\n", teachers[i].tel);
      break;
    }
  }
}
}
