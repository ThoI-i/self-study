package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------------");
            System.out.print("선택: " );
            int n = input.nextInt();

            if ( n == 1 ) {
                System.out.println("선택: " + n);
                System.out.print("입금액을 입력하세요: ");
                int amount = input.nextInt();
                balance += amount;
                System.out.println(amount + "원을 입금하셨습니다. 현재 잔액: " + balance);
            }
            if (n == 2) {
                System.out.println("선택: " + n);
                System.out.print("출금액을 입력하세요: ");
                int amount = input.nextInt();
                if ( balance < amount) {
                    System.out.println(amount + "원을 출금할 수 없습니다. 현재 잔액: " + balance);
                } else {
                    System.out.println(amount + "원을 출금하셨습니다. 현재 잔액: " + balance);
                    balance -= amount;
                }
            }
            if (n == 3) {
                System.out.println("선택: " + n);
                System.out.println("현재 잔액: " + balance + "원");
            }
            if (n == 4) {
                System.out.println("시스템을 종료합니다. 종료되었습니다.");
                break;
            }
        }
    }
}