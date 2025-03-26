public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Jan Kowalski");
            Student student2 = new Student("Anna Nowak");
            Student student3 = new Student("Hubert Bogucki");

            student1.dodajOcene(4);
            student1.dodajOcene(3);
            student1.dodajOcene(5);
            student2.dodajOcene(2);
            student2.dodajOcene(4.5);
            student2.dodajOcene(3.5);
            student3.dodajOcene(5);
            student3.dodajOcene(4.5);
            student3.dodajOcene(4);

            System.out.println(student1.name + " - zaokraglona średnia: " + student1.zauklaglonaOcena());
            System.out.println(student2.name + " - zaokraglona średnia: " + student2.zauklaglonaOcena());
            System.out.println(student3.name + " - zaokraglona srednia: " + student3.zauklaglonaOcena());

            StudentGroup group = new StudentGroup("Grupa A");

            group.dodajStudent(student1);
            group.dodajStudent(student2);
            group.dodajStudent(student3);

            System.out.println(group);

        } catch (Exception e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
