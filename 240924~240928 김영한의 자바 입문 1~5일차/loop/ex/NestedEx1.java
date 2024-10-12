//0927 문제와 풀이2-1. 구구단 출력(중첩 반복문 ~ for + for)
//파일 명이 다른 경우: 빨간색 부분 뜨는 곳에 Alt + Enter → Rename File 클릭
package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println( i + " * " + j + " = " + i * j );
            }
        }
    }
}
