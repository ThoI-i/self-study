//0927 Break2 문제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계각 10보다 큰 처음 값은 얼마인가?
//좋지 않은 코드 → Break3에서 개선함
package loop;

public class Break2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for(; ; ){
            sum += i;

            if(sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
