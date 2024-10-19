package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만듬.
        int[][] arr = {
                {1, 2, 3}, // 실제 행렬과 비슷하게 만듬
                {4, 5, 6},
                {7, 8, 9}
        }; //행2, 열3

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " "); //0열 출력
            }
            System.out.println(); //한 행이 끝나면라인을 변경
        }
    }
}
