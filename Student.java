import java.util.*;

class Student {
    int rollNo, m1, m2, m3;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll No: ");
        rollNo = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("3 Marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    void result() {
        int total = m1 + m2 + m3;
        double p = total / 3.0;
        String grade;

        if (p >= 90) grade = "A+";
        else if (p >= 80) grade = "A";
        else if (p >= 70) grade = "B";
        else if (p >= 60) grade = "C";
        else if (p >= 50) grade = "D";
        else grade = "F";

        System.out.println(name + " " + total + " " + p + "% Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.input();
        s2.input();

        s1.result();
        s2.result();
    }
}