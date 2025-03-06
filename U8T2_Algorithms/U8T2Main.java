import java.util.ArrayList;

public class U8T2Main {
    public static void main(String[] args) {
        Student s1 = new Student("Abby", 95);
        Student s2 = new Student("Barb", 98);
        Student s3 = new Student("Cole", 91);
        Student s4 = new Student("Dave", 92);
        Student s5 = new Student("Ellie", 98);
        Student s6 = new Student("Frank", 87);
        Student s7 = new Student("George", 93);
        Student s8 = new Student("Jim", 92);
        Student s9 = new Student("Kara", 95);
        Student s10 = new Student("Lenny", 98);
        Student s11 = new Student("Mona", 100);
        Student s12 = new Student("Nancy", 99);
        Student[][] chart = {{s1, s2, s3}, {s4, s5, s6}, {s7, s8, s9}, {s10, s11, s12}};
        double avg = Algorithm2DArrays.classAverage(chart);
        System.out.println(avg);
        Student[][] chart2 = {{s1, s2}, {s4, s5}, {s8, s9}};
        avg = Algorithm2DArrays.classAverage(chart2);
        System.out.println(avg);
        Student[][] chart3 = {{s6}};
        avg = Algorithm2DArrays.classAverage(chart3);
        System.out.println(avg);
        

    }
}
