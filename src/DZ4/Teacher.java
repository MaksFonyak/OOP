package DZ4;

public class Teacher {
    private String name;
    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void teaching(){
        System.out.println(name + " предмет");
    }
}
