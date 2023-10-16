package DZ1;

public class HotDrink {
    private String name;
    private int volume;
    private int temp;

    public HotDrink(String name, int volume, int temp) {
        this.name = name;
        this.volume = volume;
        this.temp = temp;
    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemp() {
        return temp;
    }
}