package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp0 {
  static Scanner keyScan = new Scanner(System.in);
  static Teacher[] teachers = new Teacher[100];
  static int length = 0;


  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");
    controler();
  }

  static void controler() {
  System.out.println("명령 > ");
  quit :switch (keyScan.nextLine()) {
    case "add" :
    inTeacherInfo();
    System.out.println("add success");
    controler();
    case "list" :
    printTeacherList(teachers, length);
    System.out.println("\nlist success\n");
    controler();
    break;
    case "view" :
    System.out.println("검색어> ");
    printTeacherView(teachers, length);
    break;
    case "quit" :
    System.out.printf("\ngood- bye\n");
    break;

  }
  }
  static void inTeacherInfo() {
     while (length < teachers.length) {
    Teacher teacher = new Teacher();


    System.out.print("이름? ");
    teacher.name = keyScan.nextLine();
    System.out.print("성별? ");
    teacher.gender = keyScan.nextLine();
    System.out.print("나이? ");
    teacher.age = Integer.parseInt(keyScan.nextLine());
    teachers[length++] = teacher;

    System.out.print("계속 입력하시겠습니까(y/n)? ");
        if (!keyScan.nextLine().equals("y")) {
          break;
    }
  }
 controler();
}
static void printTeacherList(Teacher[] teachers, int length) {
  for (int i = 0; i < length; i++) {
    Teacher teacher = teachers[i];
    System.out.printf("%s,%s,%d\n",
      teacher.name,
      teacher.gender,
      teacher.age);
    }
    controler();
  }
  static void printTeacherView(Teacher[] teachers, int length) {
    String name = keyScan.nextLine();
    for (int i = 0; i < length; i++) {
      Teacher teacher = teachers[i];
      if (name.equals(teacher.name))
      System.out.printf("\n 강사 이름: %s\n 성별: %s\n 나이: %d\n",
        teacher.name,
        teacher.gender,
        teacher.age);
    }
    controler();
  }
}

/*






*/
