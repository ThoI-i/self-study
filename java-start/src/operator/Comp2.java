//0926 비교 연산자2 // 문자열 비교 ★.equals()를 사용 // == Error 발생하는 경우有
// Ctrl + Shift + Enter 자동 문장 완성, 줄바꿈) → ) (닫힘 괄호) + ;(세미콜론)
package operator;

public class Comp2 {

    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println(result1); // true
        System.out.println(result2); // true
        System.out.println(result3); // false
    }
}
