public class Ex7_5 {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour; // 접근 할 수 없다
        System.out.println(t.getHour()); //  접근은 메서드로 할 수 있다
//        t.hour = 12; // 접근 할 수 없으니 초기화도 할 수 없다.
        t.setHour(3); // setter 메서드로 초기화 할 수 있다.
        System.out.println(t.getHour());
    }
}
class Time {

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0 > hour || hour > 23) {
            System.out.println("시간은 0부터 23까지");
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (0 > minute || minute < 59) {
            System.out.println("분은 0부터 59까지");
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (0 > second || second < 59) {
            System.out.println("초는 0부터 59까지");
            return;
        }
        this.second = second;
    }
}