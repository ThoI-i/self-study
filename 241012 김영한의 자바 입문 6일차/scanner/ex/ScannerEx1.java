package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int num1 = scanner.nextInt();
//          1. if-else
//        if (num1 % 2 == 0) {
//            System.out.println("입력한 숫자 " + num1 + "은 짝수입니다.");
//        } else {
//            System.out.println("입력한 숫자 " + num1 + "은 홀수입니다.");
//        }
//          2. 삼항연산자
        String result = (num1 % 2 == 0) ? "짝수" : "홀수";
        System.out.print("입력한 숫자 " + num1 + "은 " + result + "입니다.");
    }
}
