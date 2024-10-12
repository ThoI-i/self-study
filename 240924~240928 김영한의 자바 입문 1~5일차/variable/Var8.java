//0925 변수 타입2. 저장 가능한 테이터 길이
//실무에서 자주 쓰는 타입
//정수 int, long(21억이 넘는 경우)
//실수 double
//불린형 boolean
//문자열 string
//파일 전송 시 byte

package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127 // 2의 8승
        short s = 32767; // -32767 ~ 32767  // 2의 16승
        int i = 2147483647; //-21억 ~ 21억 // 2의 32승

        //대부분의 범위
        long l = 9223372036854775807L; // 데이터 한계치 넘을 떄 L //  2의 64승

        //실수
        float f = 10.0f; //float 사용 시 소숫점 Error가 자주 발생 // 2의 32승
        double d = 10.0; //소숫점은 double 권장 // 2의 64승

        //기타
        boolean bt = true; // 1byte
        char c = 'c'; // 1byte

    }
}
