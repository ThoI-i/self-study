package array.ex;

import java.util.Scanner;

//문제4. 5개의 정수를 입력받아서 합계와 평균을 계산하는 프로그램
public class ArrayEx4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
            average = (double) sum / (i+1);
        }
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}