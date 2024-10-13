//0926 if문만 사용 시 단점
//1. 불필요한 조건 검사: true가 있더라도 다음 조건 모두 검사
//2. 코드의 효율성: 조건을 중복 체크
// else if 사용 권장
package cond;

public class if3 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (8 <= age && age<= 13){
            System.out.println("초등학생");
        }
        if (14 <= age && age <= 16){
            System.out.println("중학생");
        }
        if (17 <= age && age <= 19){
            System.out.println("고등학생");
        }
        if (age >= 20){
            System.out.println("대학생");
        }
    }
}
