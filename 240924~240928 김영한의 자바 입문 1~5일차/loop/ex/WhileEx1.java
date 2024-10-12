//0927 문제와 풀이1. 자연수 출력(While)
//처음 10개의 자연수를 출력하는 프로그램을 작성
//변수 count
package loop.ex;

public class WhileEx1 {

    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }
}
