package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage("Hello world!",3);
        System.out.println();
        printMessage("Do you want some cookie?",5);
        System.out.println();
        printMessage("ㅋㅋㅋ",7);
    }

    public static void printMessage(String message, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
    }
}
