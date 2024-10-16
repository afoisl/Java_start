package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(25);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 출입이 불가합니다.");
            return;
        }
        System.out.println(age + "살, 환영합니다.");
    }
}
