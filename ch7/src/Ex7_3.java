public class Ex7_3 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}
class Parent2 {
    int x = 10;
}
class Child2 extends Parent2 {
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x); // 겹치는 부분이 없으면 this, super 둘 다 사용 가능
        System.out.println("super.x" + super.x);
    }
}
