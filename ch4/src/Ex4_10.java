public class Ex4_10 {
    public static void main(String[] args) {
        int sum = 1;
        for(int i = 0; i <= 5; i++) {
            sum = sum + i;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}
