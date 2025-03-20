public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Jan Kowalski");
            Student student2 = new Student("Anna Nowak");
            Student student3 = new Student("Hubert Bogucki");

            student1.addGrade(4);
            student1.addGrade(3);
            student1.addGrade(5);
            student2.addGrade(2);
            student2.addGrade(4.5);
            student2.addGrade(3.5);
            student3.addGrade(5);
            student3.addGrade(4.5);
            student3.addGrade(4);

            System.out.println(student1.name + " - zaokraglona średnia: " + student1.calculateRoundedAverage());
            System.out.println(student2.name + " - zaokraglona średnia: " + student2.calculateRoundedAverage());
            System.out.println(student3.name + " - zaokraglona srednia: " + student3.calculateRoundedAverage());

            StudentGroup group = new StudentGroup("Grupa A");

            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);

            System.out.println(group);

        } catch (Exception e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
