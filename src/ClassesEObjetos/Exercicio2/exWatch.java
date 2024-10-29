package ClassesEObjetos.Exercicio2;

public class exWatch {
    public static void main(String[] args) {
        Watch w = new Watch();
        w.setTime(11,30,100);

        System.out.println(w.readHour() + ":" + w.readMinute() + ":" + w.readSecond());

        System.out.println(w.hour.number);
        System.out.println(w.minute.number);
        System.out.println(w.second.number);
    }

}
