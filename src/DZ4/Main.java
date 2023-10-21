package DZ4;

public class Main {
    public static void main(String[] args){
        MathTeacher mathematician = new MathTeacher("Иван Иванов");
        LanguageTeacher linguist = new LanguageTeacher("Анна Круглова");

        TeacherGroup<Teacher> group = new TeacherGroup<>();
        group.addTeacher(mathematician);
        group.addTeacher(linguist);

        group.teachingLessons();
    }
}
