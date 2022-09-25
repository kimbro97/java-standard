public class Ex7_11 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();
        c.method2();
        MyInterFace.staticMethod();
        MyInterFace2.staticMethod();
    }
}
class Child3 extends Parent3 implements MyInterFace, MyInterFace2 {
    public void method1() {
        System.out.println("method1() in Child3");
    }
}
class Parent3 {
    public void method2() {
        System.out.println("method2() in Parent3");
    }
}
interface MyInterFace {
    default void method1() {
        System.out.println("method1() in MyInterFace");
    }
    default  void method2() {
        System.out.println("method2() in MyInterFace");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterFace");
    }
}

interface MyInterFace2 {
    default void method1() {
        System.out.println("method1() in MyInterFace2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterFace2");
    }
}
