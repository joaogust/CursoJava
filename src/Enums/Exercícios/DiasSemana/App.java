package Enums.Exercícios.DiasSemana;

import Enums.Month;

public class App {

    public enum Week {
        SABADO(null),
        SEXTA(SABADO),
        QUINTA(SEXTA),
        QUARTA(QUINTA),
        TERÇA(QUARTA),
        SEGUNDA(TERÇA),
        DOMINGO(SEGUNDA);

        private Week next;

        Week(Week next) {
            this.next = next;
        }

        public Week next() {
            return this.next == null ? DOMINGO : this.next;
        }
    }

    public static void main(String[] args) {

        Week w = Week.DOMINGO;
        System.out.println(w);

        w = w.next();
        System.out.println(w);

        w = w.next();
        System.out.println(w);

        w = w.next();
        System.out.println(w);

        w = w.next();
        System.out.println(w);

        w = w.next();
        System.out.println(w);

        w = w.next();
        System.out.println(w);
    }
}
