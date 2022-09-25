public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new Dropship() };
        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}
abstract class Unit {
    int x;
    int y;

    abstract void move(int x, int y);
    void stop() {}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x="+x+", y="+y+"]");
    }
    void stimPack() {
        /*스팀팩을 사용한다.*/
    }
}
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x="+x+", y="+y+"]");
    }
    void changeMode() {
        /*공격모드로 변환한다.*/
    }
}
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x="+x+", y="+y+"]");
    }
    void load() {
        /*공격모드로 변환한다.*/
    }
    void unload() {
        /*공격모드로 변환한다.*/
    }
}