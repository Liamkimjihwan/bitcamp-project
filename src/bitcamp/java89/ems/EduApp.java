package bitcamp.java89.ems;
import java.util.Scanner;
public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");


    // 여러명의 강사 정보를 입력하기 위한 레퍼런스 배열을 만든다.
    Teacher[] teachers = new Teacher[100]; // teacher 100개를 담을 레퍼런스
    // 배열로 데이터를 다루면 확장성이 없음..
   int length = 0; // 레퍼런스 배열 (Teacher[] teacher)에 몇명의 강사 정보를 저장했는지 개수를 지정한다.
          // 레퍼런스 배열에 몇 개의 Teacher 인스턴스가 들어있는지 그 개수를 보관한다.

  Scanner keyScan = new Scanner(System.in);

  // 반복해서 입력 받는다.
 // 주소 없음을 의미한다. Teacher teacher = null;
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
   printTeacherList(teachers, length);
  }

static void printTeacherList(Teacher[] teachers, int length) {
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
}
