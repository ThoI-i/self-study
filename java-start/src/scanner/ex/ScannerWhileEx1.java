package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = input.nextLine();
            if ( name.equals("종료") ){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // ex) 10(가져감) + Enter(\n-남음) | 입력 시[숫자 + Enter(\n)] : nextInt()는 숫자만 가져감
            input.nextLine(); // Enter(\n-를 버림) | 그래서 \n(Enter)는 남아있고 String name에서 데이터 없는 값을 받고 int age로 바로 넘어감

            System.out.println("입력한 이름: " + name + ", 나이 : " + age);
        }
    }
}
