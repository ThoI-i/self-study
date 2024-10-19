package array;

public class ArrayDi1 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만듬.
        int[][] arr = new int[2][3]; //2행, 3열


        for (int row = 0; row<2; row++){
            for( int col = 0; col<3; col++) {
                System.out.print(arr[row][col] + " "); //0열 출력
            }
            System.out.println(); //한 행이 끝나면라인을 변경
        }
    }
}
