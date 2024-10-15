package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 (-1을 입력하면 종료) : ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }
            sum += num;
            count++;
        }
        double average = (double) sum / count;

        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}
