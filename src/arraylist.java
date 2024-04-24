import java.util.ArrayList;
public class arraylist
{
    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();


        studentNames.add("Ahmet");
        studentGrades.add(85.5);

        studentNames.add("Mehmet");
        studentGrades.add(60.0);

        studentNames.add("Ayşe");
        studentGrades.add(45.5);


        double minGrade = 50.0;


        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i) < minGrade) {
                studentNames.remove(i);
                studentGrades.remove(i);
                i--;
            }
        }

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + " - " + studentGrades.get(i));
        }

    }
}