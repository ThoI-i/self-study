package array.ex;
//문제3: 숫자 5개를 배열로 입력하고 역순으로 출력받기
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if(i > 0) {
                System.out.print(", "); // 마지막 숫자는 , 를 안 붙이기 위해
            }
        }
    }
}
