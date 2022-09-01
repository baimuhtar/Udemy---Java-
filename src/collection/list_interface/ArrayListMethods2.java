package collection.list_interface;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 20, 1, 8.3);
        Student s2 = new Student("Nikolay", 'm', 23, 3, 6.4);
        Student s3 = new Student("Elene", 'f', 21, 2, 9.0);
        Student s4 = new Student("Petya", 'm', 35, 5, 8.9);
        Student s5 = new Student("Nina", 'f', 28, 4, 7.1);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        System.out.println(studentList);
        Student s6 = new Student("Nina", 'f', 28, 4, 7.1);
       // studentList.remove(s6);
        int index = studentList.indexOf(s6);
        System.out.println(studentList);
        System.out.println(index);
        System.out.println(studentList.indexOf(s3));
    }
}

        class Student {
        private String name;
        private char sex;
        private int age;
        private int course;
        private double avgGrade;

        public Student(String name, char sex, int age, int course, double avgGrade) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    ", course=" + course +
                    ", avgGrade=" + avgGrade +
                    '}';
        }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, sex, age, course, avgGrade);
            }
        }
