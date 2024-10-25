package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    // 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
    // 2차원 배열 사용
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = {"국어", "수학", "영어"};

        for (int i = 0; i < students[i].length; i++) {
            System.out.println((i + 1) + "번 학생");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + "의 점수를 입력하세요 : ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < students[i].length; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += students[i][j];
            }
            double average = sum / 3.0;
            System.out.println((i+1) + "학생의 총점 : " + sum + ", 평균 : " + average);
        }
    }
}
