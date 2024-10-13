//0927 Break3 문제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계각 10보다 큰 처음 값은 얼마인가?
//개선된 코드
package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; ; i++){
            sum += i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
