package ClassesWrappers;

public class WrapperApp4 {

    public static void main(String[] args) {
        // Autoboxing >> EX1
        Integer i = 10;
        i++;
        System.out.println(i);

        // No autoboxing >> EX2
        Integer j = Integer.valueOf(10);
        int t = j.intValue();
        t++;
        j = Integer.valueOf(t);
        System.out.println(j);

        /*
        Por trás dos panos, a IDE faz a parte do "No autoboxing".
        - Ele desembrulha e embrulha novamente como está no EX:2
         */
    }
}
