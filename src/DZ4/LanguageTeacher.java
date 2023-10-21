package DZ4;

public class LanguageTeacher extends Teacher{
    public LanguageTeacher (String name) {
        super(name);
    }

    @Override
    public void teaching() {
        System.out.println(getName() + " препадаёт языки");
    }
}
