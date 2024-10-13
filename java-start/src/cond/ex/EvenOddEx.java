//0926 문제와 풀이 2-4. 홀수 짝수 찾기
//evenOdd(짝/홀)
package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 20;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
