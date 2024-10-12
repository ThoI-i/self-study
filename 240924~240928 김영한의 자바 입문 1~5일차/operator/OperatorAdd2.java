//0926 전위, 후위 증감연산자
package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //전위 증감 연산자
        b = ++a; //a의 값을 먼저 증가, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        // b = ++a;

        // a = a  + 1;
        // b = a;

        //후위 증감 연산자
        a = 1; // 재지정
        b = 0; // 재지정

        b = a++; // a의 현재값을 b에 먼저 대입 후, a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);

        // b = a++;

        // b = a;
        // a = a  + 1;
    }
}
