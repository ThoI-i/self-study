//0926 논리연산자2. &&, ||, ! // 범위 보기 쉽게 만들자
package operator;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        boolean result = 10< a && a < 20; // (a > 10) && (a < 20)
        //↑ 10< a && a < 20 보기 편함
        System.out.println("result = " + result);
    }
}
