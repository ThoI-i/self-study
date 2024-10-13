package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0 ;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int option = input.nextInt();

            switch ( option ) {
                case 1:
                input.nextLine();
                System.out.print("상품명을 입력하세요 : ");
                String itemName = input.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int itemPrice = input.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int itemQuantity = input.nextInt();
                input.nextLine();

                total += itemPrice * itemQuantity;
                System.out.println("상품명 : " + itemName + " 가격 : " + itemPrice + " 수량 : " + itemQuantity + " 합계 : " + itemPrice * itemQuantity);
                break;

                case 2 :
                System.out.println("총 비용 : " + total);
                total = 0;
                break;

                case 3 :
                System.out.print("프로그램을 종료합니다.");
                input.close(); // Scanner 닫기
                return; // 프로그램 종료

                default :
                System.out.println("올바른 옵션을 선택해주세요.");
                break;
            }
        }
    }
}