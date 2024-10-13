package array;

public class Array1Ref4 {
    public static void main(String[] args) {
//        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50}; // 자바가 배열이란 걸 추론하여 생략가능
        //단, 선언과 동시에 사용해야함
        //int[] students;
        //stdents = {90, 80, 70, 60, 50} 시 인식 못함
        
        // 변수 값 사용
        for (int i = 0; i < students.length; i++) { //student.length: 배열 길이를 반환
            System.out.println("학생" + (i + 1) +  " 점수: " + students[i]);
        }
    }
}
