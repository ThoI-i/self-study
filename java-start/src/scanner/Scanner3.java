//0928 Scanner 학습1-3. 예제1. 두 수를 입력받고 더 큰 수를 출력하기
package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요. ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요. ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("첫 번째 숫자가 더 큽니다: " + num1);
        } else if (num2 > num1) {
            System.out.println("두 번째 숫자가 더 큽니다: " + num2);
        } else {
            System.out.println("두 숫자는 같습니다.");
        }
    }
}