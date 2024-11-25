package array.ex;

import java.util.Scanner;

//문제5. n개의 정수를 입력받아서 합계와 평균을 계산하는 프로그램
public class ArrayEx5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = input.nextInt();
        int[] numbers = new int[count];
        int sum = 0;
        double average = 0;

        System.out.println(count + "개 의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / (count);
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}