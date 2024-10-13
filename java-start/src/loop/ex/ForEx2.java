//0927 문제와 풀이2. 짝수 출력(For)
//num이라는 변수를 사용
package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        int num = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}