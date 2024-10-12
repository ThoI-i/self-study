//0927 DoWhile문2: 무조건 1번은 실행
package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do{ //한번 실행 → 조건으로 이동 → 참이면 재실행
            System.out.println("현재 숫자는: " + i);
            i++;
        }
        while (i < 3); { //조건 → 거짓일 경우 빠져나감
        }
    }
}
