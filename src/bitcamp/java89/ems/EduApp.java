package bitcamp.java89.ems;
import java.util.Scanner;
public class EduApp {
   // ★ 레퍼런스 배열 (Teacher[] teacher)에 몇명의 강사 정보를 저장했는지 개수를 지정한다.
  static Scanner keyScan = new Scanner(System.in);
// 클래스 변수로 만들기 위해서는 static 붙여서, 이 클래스 변수는 다른 static 메서드에서 공유할 수 있게 됨
  public static void main(String[] args) {
    // EduApp에서 사용하는 keyScan을 Teachercontroller와 공유한다는 뜻
   TeacherController teacherController = new TeacherController(keyScan);
                //                             = (객체) keyScan은 스캐너 값을 받아야하는데
                                      //       이렇게 객체
 // new TeacherController(keyScan);
 // teachers, length, Scanner인 keyScan이 만들어짐.
// teacherController.doAdd(); doadd를 호출하되 100번지
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");

  loop :
   while (true) {
    System.out.print("명령> ");
    String command = keyScan.nextLine().toLowerCase();

    switch (command) {
      case "add": teacherController.doAdd(); break;
      case "list": teacherController.doList(); break;
      case "view": teacherController.doview(); break;
      case "delete": teacherController.doDelete(); break;
      case "update": teacherController.doUpdate(); break;
      case "quit":
        System.out.println("Good-bye");
        break loop;
     default:
       System.out.println("지원하지 않는 명령어입니다.");
    }
  }
}
}
