//0927 break, continue1 / 문제1. 1부터 5까지 숫자를 출력하는데, 숫자가 3일 떄는 출력을 건너뛰어야 한다.
package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 다음 조건(i의 값이 4)으로 이동
            }
            System.out.println(i);
            i++;
        }
    }
}