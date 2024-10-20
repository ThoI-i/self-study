package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrice = new int[maxProducts];
        int productCount = 0;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = input.nextInt(); // 10 \n 시 nextInt();는 숫자만 가져감
            input.nextLine();

            if (menu == 1) {

                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 2, 3번 선택지 선택 가능하도록 while문으로 회귀
                    //break; 를 쓸 시 무한 반복이 종료됨.
                }
                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = input.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                productPrice[productCount] = input.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println( productNames[i] + ": " + productPrice[i] +"원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }

        }
    }
}
