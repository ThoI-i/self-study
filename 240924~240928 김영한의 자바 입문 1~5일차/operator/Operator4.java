//0925 연산자 우선순위 2.
package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // 가독성 ↑ = 명확, 단순한게 좋음
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
