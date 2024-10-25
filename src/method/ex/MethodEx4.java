package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {

            System.out.println("-------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 : ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int deposit = scanner.nextInt();
                balance = deposit(balance, deposit);
                continue;
            }
            if (num == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int withdraw = scanner.nextInt();
                balance = withdraw(balance, withdraw);
                continue;
            }
            if (num == 3) {
                System.out.println("현재 잔액 : " + balance + "원");
                continue;
            }
            if (num == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }

    public static int deposit(int balance, int i) {
        balance += i;
        System.out.println(i + "원을 입금하였습니다. 현재 잔액: " + balance
                + "원");
        return balance;
    }

    public static int withdraw(int balance, int draw) {
        if (balance >= draw) {
            balance -= draw;
            System.out.println(draw + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(draw + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
