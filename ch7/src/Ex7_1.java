class Tv {
    boolean power;
    int channel;

    void power() {
        this.power = !this.power;
    }
    void channelUp() {
        this.channel++;
    }
    void channelDown() {
        this.channel--;
    }
}

class SmartTv extends Tv { // extends는 상속
    boolean caption;
    void disPlayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();

        stv.channel = 10; // 조상으로부터 받은 값을 상속 받아서 사용할 수 있다
        stv.channelUp();
        System.out.println(stv.channel);
        stv.disPlayCaption("Hello, World"); // 자손클래스에서는 메서드와 변수를 추가해서 사용할 수 있다.
        stv.caption = true;
        stv.disPlayCaption("Hello World");
    }
}
