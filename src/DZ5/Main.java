package DZ5;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher teacher1 = new Teacher(1, "Петр Иванович");
        Teacher teacher2 = new Teacher(2, "Марь Иванна");
        Student student1 = new Student(1, "Студент 1");

        Student student2 = new Student(2, "Студент 2");
        Student student3 = new Student(3, "Студент 3");

        List<Integer> studentIds = new ArrayList<>();
        studentIds.add(1);
        studentIds.add(2);

        EducationalGroup educationalGroup = controller.createEducationalGroupWithIds(1, studentIds);

        System.out.println("Учебная группа с преподавателем " + educationalGroup.getTeacher().getName()
                + " и студентами:");
        for (Student student : educationalGroup.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
