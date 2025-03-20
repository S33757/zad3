import java.util.HashSet;
import java.util.Set;

public class StudentGroup {
    public String groupName;
    public Set<Student> students;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Grupa jest pełna – maksymalna liczba studentów to 15.");
        }
        if (!students.add(student)) {
            throw new IllegalStateException("Student już znajduje się w grupie.");
        }
    }

    @Override
    public String toString() {
        return "Grupa: " + groupName + ", Studenci: " + students;
    }
}