//0927 문제와 풀이3. 누적 합 계산(For)
//반복문을 사용하여 1부터 max까지의 합을 계산, 출력하는 프로그램 작성
//변수: max(마지막 카운트), sum(합), i(카운트)
package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int max = 3;

        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

