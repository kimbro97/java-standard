public class Exercise6_7 {

}
class Marine {
    int x = 0;
    int y = 0;
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;

    static void WeaponUp() {
        weapon++;
    }
    static void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// 일단 마린의 공격력과 방어력은 모든 마린 인스턴스가 같아야하기 때문에 static으로 고정해야하고
// 공격력, 방어력은 업은 인스턴스변수를 사용하고 있지 않기때문에 static을 사용해야한다
