package Interfaces.walk.Revisao;

public class Watch {
    Pointer hour = new Pointer();
    Pointer minute = new Pointer();
    Pointer second = new Pointer();

    public Watch(int hour, int minute, int second) {
        this.hour.number = hour;
        this.minute.number = minute / 5;
        this.second.number = second / 5;
    }

    public int readHour() {
        return hour.number;
    }
    public int readMinute() {
        return minute.number * 5;
    }
    public int readSecond() {
        return second.number * 5;
    }
    public int readPointerHour() {
        return hour.number;
    }
    public int readPointerMinute() {
        return minute.number;
    }
    public int readPointerSecond() {
        return second.number;
    }

    public static void main(String[] args) {
        var clock = new Watch(5, 50, 30);

        System.out.println(clock.readPointerHour() + ":" + clock.readPointerMinute() + ":" + clock.readPointerSecond());
        System.out.println(clock.readHour() + ":" + clock.readMinute() + ":" + clock.readSecond());

    }
}
