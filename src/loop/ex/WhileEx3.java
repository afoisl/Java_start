package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int init = 1;
        int max = 100;
        int sum = 0;

        while (init <= max) {
            sum = sum + init;
            init++;
        }
        System.out.println(sum);
    }

}
