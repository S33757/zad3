import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public List<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grades.size() >= 20) {
            throw new IllegalStateException("Student moze miec maksymalnie 20 ocen.");
        }
        grades.add(grade);
    }

    public double calculateRoundedAverage() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Brak ocen. Nie mozna obliczyc sredniej.");
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();

        double[] possibleGrades = {2.0, 3.0, 3.5, 4.0, 4.5, 5.0};
        double closest = possibleGrades[0];
        for (double possible : possibleGrades) {
            if (Math.abs(possible - average) < Math.abs(closest - average)) {
                closest = possible;
            }
        }

        return closest;
    }
}
