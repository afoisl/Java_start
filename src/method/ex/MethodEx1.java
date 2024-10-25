package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {

        System.out.println("평균값: " + myMethod(1, 2, 3));
        System.out.println("평균값: " + myMethod(15, 25, 35));
    }

    public static double myMethod(double a, double b, double c) {
        double sum = a + b + c;
        double average = sum / 3.0;
        return average;
    }
}
