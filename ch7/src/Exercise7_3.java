class Product1 {
    int price;
    int bonusPoint;

    Product1() {}

    Product1(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}
class Tv10 extends Product1 {
    Tv10() {}

    public String toString() {
        return "Tv";
    }
}
public class Exercise7_3 {
    public static void main(String[] args) {
        Tv10 t = new Tv10();
    }
}
