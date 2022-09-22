public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(5L, 3L);

        System.out.println("add(5L, 3L)" + result1);
        System.out.println("subtract(5L, 3L)" + result2);
        System.out.println("multiply(5L, 3L)" + result3);
        System.out.println("divide(5L, 3L)" + result4);
        System.out.println("max(5L, 3L)" + result5);
    }
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long max(long a, long b) {
        long result = 0;
        result = a > b ? a : b;
        return result;
    }
    long subtract(long a, long b) {
        long result = a - b;
        return result;
    }
    long multiply(long a, long b) {
        long result = a * b;
        return result;
    }
    double divide(double a, double b) {
        double result = a / b;
        return result;
    }
}
