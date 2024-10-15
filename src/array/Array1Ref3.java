package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        // 배열 변수의 선을 한 줄에 함께 사용할 때만 사용 가능한 편리한 초기화
        int[] students = {90, 80, 70, 60, 50}; // 배열 생성과 초기화

        // 변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + "의 점수 : " + students[i]);
        }
    }
}
