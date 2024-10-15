package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요(종료를 입력하면 종료) : ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt(); // 10/n -> 숫자만 가져가기 때문에 /n이 남아있음
            scanner.nextLine(); // /n을 읽고 없애는 용도


            System.out.println("이름 : " + name + ", 나이 : " + age);
        }
    }
}
