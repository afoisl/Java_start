package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 1; //m 생존 시작

        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
    }
}