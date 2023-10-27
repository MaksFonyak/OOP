package DZ5;
import java.util.List;
class Controller {
    private EducationalGroupService educationalGroupService;

    public Controller() {
        educationalGroupService = new EducationalGroupService();
    }

    public EducationalGroup createEducationalGroupWithIds(int teacherId, List<Integer> studentIds) {
        // Здесь предполагается, что у вас есть механизмы для получения
        // объектов Teacher и Student по их Id из базы данных или других источников.

        Teacher teacher = getTeacherById(teacherId);

        List<Student> students = getStudentsByIds(studentIds);

        return educationalGroupService.createEducationalGroup(teacher, students);
    }

    // Метод для получения преподавателя по Id
    private Teacher getTeacherById(int teacherId) {
        // Здесь реализуйте логику получения преподавателя по Id
        // Например, запрос к базе данных
        return new Teacher(teacherId, "Иван Петрович");
    }

    // Метод для получения списка студентов по списку Id
    private List<Student> getStudentsByIds(List<Integer> studentIds) {
        // Здесь реализуйте логику получения студентов по списку Id
        // Например, запрос к базе данных
        // В этом примере, мы просто возвращаем пустой список
        return List.of();
    }
}
