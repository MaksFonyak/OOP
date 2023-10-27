package DZ5;
import java.util.List;

public class EducationalGroupService {
    public EducationalGroup createEducationalGroup(Teacher teacher, List<Student> students) {
        return new EducationalGroup(teacher, students);
    }
}

