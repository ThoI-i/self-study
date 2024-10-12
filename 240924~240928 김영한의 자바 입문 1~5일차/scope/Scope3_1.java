//0927 스코프2-1. 스코프의 존재 이유
//temp의 안 좋은 사용 예)
package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 조건 만족 시에만 사용됨
        //1. 비효율적 메모리 사용
        //2. 코드 복잡성 증가(생각해야할 변수 ↑)
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
