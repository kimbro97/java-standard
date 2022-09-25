class Outer2 { // 외부 클래스
    static class Inner { // 내부 클래스(인스턴스 클래스)
        int iv = 100;
    }
}
public class Exercise7_7 {
    public static void main(String[] args) {
        Outer2.Inner ii = new Outer2.Inner();
        System.out.println(ii.iv);
    }
}