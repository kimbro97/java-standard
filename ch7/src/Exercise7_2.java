class SutdaDeck2 { // 20장의 덱
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck2() { // 여기서 어떻게 초기화를 시켜줘야 할까?
        for (int i = 0; i < cards.length; i ++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }
}
class SutdaCard2 { // 카드
    int num;
    boolean isKwang;
    SutdaCard2() {
        this(1, true); // 클래스의 기본 생성자에서 밑에 있는 생성자를 호출해서 초기화 시켜준다.
    }
    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() { // Object에있는 toString을 오버라이딩했다.
        return num + (isKwang ? "K" : "");
    }
}
public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck(); // SutdaDeck 객체 생성

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
    }
}
