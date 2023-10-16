package DZ1;

import DZ1.HotDrink;
import DZ1.HotDrinksMashine;

public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Чай", 250, 80);
        HotDrink coffe = new HotDrink("Кофе", 350, 90);
        HotDrink chocolate = new HotDrink("Горячий шоколад", 200, 75);

        HotDrinksMashine Machine = new HotDrinksMashine();
        Machine.addDrink(tea);
        Machine.addDrink(coffe);
        Machine.addDrink(chocolate);


        HotDrink orderedDrink = Machine.getProduct("Кофе", 350, 90);
        if (orderedDrink != null) {
            System.out.println("Ваш напиток: " + orderedDrink.getName());
        } else {
            System.out.println("Извините, такой напиток недоступен.");
        }
    }
}