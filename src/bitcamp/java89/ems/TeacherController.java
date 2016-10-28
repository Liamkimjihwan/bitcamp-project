package bitcamp.java89.ems;
import java.util.Scanner; // 만약 여기 Scanner가 없으면 java.util 스캐너를 찾아가라 라는 뜻.
public class TeacherController {
  static Teacher[] teachers = new Teacher[100]; //★ teacher 100개를 담을 레퍼런스
  static int length = 0;
  static Scanner keyScan; // eduapp에서도 여기서도 사용해야 하기 떄문에 선언.

  // dolist add view를 사용하려면 keyScan

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
