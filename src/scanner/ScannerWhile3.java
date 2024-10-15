package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        // 사용자는 한 번에 한개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램 종료.
        // 이 때, 사용자가 입력한 모든 정수의 합을 출력해야 함.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요(0을 입력하면 종료) : ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
