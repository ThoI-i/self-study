//0926 문제와 풀이 2-1. 평점에 따른 영화 추천하기
package cond.ex;

public class MovieRateEx {

    public static void main(String[] args) {
        double rating = 7.1;

        if ( rating <= 9 ) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if ( rating <= 8 ) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if ( rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
