import java.util.ArrayList;
import java.util.List;

public class FilterMethod {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 18, 1, 6.7);
        Student st2 = new Student("Anfisa", 'f', 23, 4, 3.1);
        Student st3 = new Student("George", 'm', 26, 6, 7.8);
        Student st4 = new Student("Anna", 'f', 21, 2, 5.6);
        Student st5 = new Student("Mike", 'm', 24, 4, 6.8);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Student> ageLess21 = students.stream().filter(element -> element.getAge() <= 21).toList();

        System.out.println(ageLess21);

        List<Student> ageAndAvgMark = students.stream().filter(element -> element
                .getAge() >= 23 && element.getAvgMark() > 5).toList();

        System.out.println(ageAndAvgMark);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgMark;

    public Student(String name, char sex, int age, int course, double avgMark) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgMark() {
        return avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgMark=" + avgMark +
                '}';
    }
}


