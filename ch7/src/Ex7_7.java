public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe에서 형변환이 생략됨
//      car.water(); // 컴파일 오류 Car 타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine) car; // 조상타입에서 자손타입으로의 형변환은 생략할 수 없다.
        fe2.water(); // 현변환을 해줬기 때문에 water 메서드를 사용할 수 있다.
    }
}
class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }
    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water~!!");
    }
}
