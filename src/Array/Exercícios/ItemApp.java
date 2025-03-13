package Array.Exercícios;

import java.math.BigDecimal;

public class ItemApp {

    public static void main(String[] args) {

        var array = new Item[3];

        array[0] = new Item("Coca-Cola", 9.99);
        array[1] = new Item("Guaraná", 11);
        array[2] = new Item("Fanta Uva", 8.00);

        Object[] result = process(array);

        Item min = (Item) (result[0]);
        Item max = (Item) (result[1]);
        Double media = (Double) (result[2]);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.format("Média: %.2f", media);

    }

    private static Object[] process(Item[] array) {

        Item min = array[0];
        Item max = array[0];
        double som = array[0].price();

        for (Item item: array) {
            if(min.price() > item.price()){
                min = item;
            }
            if(max.price() < item.price()){
                max = item;
            }
            som += item.price();
        }

        double media = som / array.length;

        return new Object[]{ min, max, media };
    }
}
