//0926 문제와 풀이 2-3. 더 큰 숫자 찾기
package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
