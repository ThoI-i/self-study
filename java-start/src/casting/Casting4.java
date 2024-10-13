//0928 계싼과 형변환1.
//같은 타입 계산 같은 타입
//다른 타입 계산 큰 범위로 자동 형변환 
package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2; //1
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; //1.0
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; //1.5
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2; //1.5
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b; //1,5
        System.out.println("result = " + result);
    }
}