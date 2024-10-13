//0927 문제와 풀이2-2. 피라미드 출력(반쪽만)
//힌트: 중첩 반복문
//print()는 줄바꿈 X(Enter X) / println()은 줄바꿈 O(Enter O)
package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
