//0926 while(반복문)5. i부터 endNum까지 수를 더하기
package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 12;

        while ( i <= endNum ) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}