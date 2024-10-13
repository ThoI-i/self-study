//0927 스코프2. 지역변수와 스코프
package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { //블록 내부, for문 내
            System.out.println("for m = " + m); //블록 내에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } //i 생존 가능

        //System.out.println("main i = " + i); //cannot find symbol
        System.out.println("main m = " + m);
    }
}
