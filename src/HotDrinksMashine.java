import java.util.ArrayList;
import java.util.List;

public class HotDrinksMashine implements DrinksMashine {
    private List<HotDrink> Drinks;

    public HotDrinksMashine() {
        Drinks = new ArrayList<>();
    }

    public void addDrink(HotDrink Drink) {
        Drinks.add(Drink);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink Drink : Drinks) {
            if (Drink.getName().equals(name) &&
                    Drink.getVolume() == volume &&
                    Drink.getTemp() == temperature) {
                return Drink;
            }
        }
        return null;
    }
}