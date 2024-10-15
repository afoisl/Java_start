package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        for (int init = 1; init <= max; init++) {
            sum += init;
        }
        System.out.println(sum);
    }
}
