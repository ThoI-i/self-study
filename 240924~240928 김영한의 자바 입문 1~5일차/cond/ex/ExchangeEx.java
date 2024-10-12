//0926 문제와 풀이1-3. 환율 계산하기
//모든 조건에서 사용되는 변수가 아닐 시, 해당 조건에 변수를 지정하자 가독성 ↑
package cond.ex;

public class ExchangeEx {

    public static void main(String[] args) {
        int dollar = 10;

        if (dollar < 0 ) {
            System.out.println("잘못된 금액입니다.");
        } else if ( dollar == 0 ) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
}
