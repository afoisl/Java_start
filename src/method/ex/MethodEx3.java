package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;
        // 입금 1000
        balance = deposit(balance, 1000);

        // 출금 2000
        balance =  withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int i) {
        balance += i;
        System.out.println(i + "원을 입금하였습니다. 현재 잔액: " + balance
                + "원");
        return balance;
    }

    public static int withdraw(int balance, int draw) {
        if (balance >= draw) {
            balance -= draw;
            System.out.println(draw + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(draw + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
