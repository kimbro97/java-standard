public class Exercise6_5 {

}
class PlayingCard {
    int kind; // 인스턴스 변수
    int num; // 인스턴스 변수

    static int width; // 클래스 변수
    static int height; // 클래스 변수

    PlayingCard(int k, int n) { // 생성자
        kind = k;
        num = n;
    }

    public static void main(String[] args) { // 지역변수
        PlayingCard card = new PlayingCard(1, 1); // 지역 변수
    }
}
