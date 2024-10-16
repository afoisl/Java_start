package array;

public class EnhancedFor {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};



        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
        }

        // 향산된 for, for-each문
        for (int number : numbers) { // 나 이 배열 처음부터 끝까지 다 돌릴꺼
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + (i + 1) + "번의 결과는 : " + numbers[i ]);
        }

    }
}
