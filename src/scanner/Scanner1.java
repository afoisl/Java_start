package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();
        System.out.println("입력받은 문자열 : " + str);
    }
}
