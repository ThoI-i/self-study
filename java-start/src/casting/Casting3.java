//0927 형 변환2-2. 오버플로우
package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647L; //int 최고값
        long maxIntOver =  2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver = " + intValue); //int의 제일 작은 범위에서 다시 시작 ex)시계가 한 바퀴 돌고 1부터 시작
    }
}
