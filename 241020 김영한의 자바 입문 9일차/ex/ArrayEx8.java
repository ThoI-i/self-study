package array.ex;

import java.util.Scanner;

//문제8. 학생수를 입력받아 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균 계산 프로그램
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int count = 0;
        count = input.nextInt();
        int[][] scores = new int[count][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < count; i++) {
                int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
                }
            double average = (double) total / 3;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
