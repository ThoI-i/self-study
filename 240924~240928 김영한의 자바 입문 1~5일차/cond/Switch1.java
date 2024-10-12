//0926 Switch문: if문 예제1
//if문 비교 연산자 사용 가능 / Switch문 값이 같은지만 비교
//Switch문 = if문을 조금 더 간편하게 사용 가능
package cond;

public class Switch1 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2){
            coupon = 2000;
        } else if (grade == 3){
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
