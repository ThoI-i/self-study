package method.ex;

import java.util.Scanner;

public class MethodEx4_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------------");
            System.out.print("선택: ");
            int n = input.nextInt();

            if (n == 1) {
                System.out.println("선택: " + n);
                System.out.print("입금액을 입력하세요: ");
                int amount = input.nextInt();
                balance = deposit(0, amount);
            } else if (n == 2) {
                System.out.println("선택: " + n);
                System.out.print("출금액을 입력하세요: ");
                int amount = input.nextInt();
                balance = withdraw(balance, amount);

            }else if (n == 3) {
                System.out.println("선택: " + n);
                System.out.println("현재 잔액: " + balance + "원");
            }else if (n == 4) {
                System.out.println("시스템을 종료합니다. 종료되었습니다.");
                break;
            }
            else {
                System.out.println("1, 2, 3, 4 중 하나를 선택해주세요.");
            }
        }
        input.close();
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하셨습니다. 현재 잔액: " + balance);
        return balance;
    }
    public static int withdraw(int balance, int amount) {
        if (balance < amount) {
            System.out.println(amount + "원을 출금할 수 없습니다. 현재 잔액: " + balance);
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하셨습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
