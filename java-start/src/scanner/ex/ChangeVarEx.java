package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp; // 값을 임시로 저장함

        //시작
        temp = a; //a값을 temp에 넣어둠 / temp = 10 , a = 10
        a = b; // a에 b값을 넣음 / a = 20, b = 20
        b = temp; // b에 temp 값을 넣음 b = 10, temp = 10

        //종료
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
