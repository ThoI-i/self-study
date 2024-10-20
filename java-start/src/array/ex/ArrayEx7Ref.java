package array.ex;

import java.util.Scanner;

//문제7. 4명의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균 계산 프로글매
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] std_grd = new int[4][3];
        int sum = 0;
        double average = 0;

        System.out.println("1번 학생의 성적을 입력하세요:");
        System.out.print("국어 점수: ");
        std_grd[0][0] = input.nextInt();
        System.out.print("영어 점수: ");
        std_grd[0][1] = input.nextInt();
        System.out.print("수학 점수: ");
        std_grd[0][2] = input.nextInt();
        input.nextLine();

        System.out.println("2번 학생의 성적을 입력하세요:");
        System.out.print("국어 점수: ");
        std_grd[1][0] = input.nextInt();
        System.out.print("영어 점수: ");
        std_grd[1][1] = input.nextInt();
        System.out.print("수학 점수: ");
        std_grd[1][2] = input.nextInt();
        input.nextLine();

        System.out.println("3번 학생의 성적을 입력하세요:");
        System.out.print("국어 점수: ");
        std_grd[2][0] = input.nextInt();
        System.out.print("영어 점수: ");
        std_grd[2][1] = input.nextInt();
        System.out.print("수학 점수: ");
        std_grd[2][2] = input.nextInt();
        input.nextLine();

        System.out.println("4번 학생의 성적을 입력하세요:");
        System.out.print("국어 점수: ");
        std_grd[3][0] = input.nextInt();
        System.out.print("영어 점수: ");
        std_grd[3][1] = input.nextInt();
        System.out.print("수학 점수: ");
        std_grd[3][2] = input.nextInt();
        input.nextLine();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sum += std_grd[i][j];
                average = (double) sum / 3;
            }
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
            sum = 0;
            average = 0;
        }
    }
}
