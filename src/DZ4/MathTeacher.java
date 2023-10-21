package DZ4;

public class MathTeacher extends Teacher{
    public MathTeacher (String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void teaching() {
        System.out.println(getName() + " препадаёт математику");;
    }
}
