package DZ4;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroup<T extends Teacher> {
    private List<T> teachers;

    public TeacherGroup() {
        teachers = new ArrayList<>();
    }

    public void addTeacher(T teacher) {
        teachers.add(teacher);
    }
    public void teachingLessons(){
        for(T teacher : teachers){
            teacher.teaching();
        }
    }

}
