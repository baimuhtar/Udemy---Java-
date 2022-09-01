package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
//    void printStudentsOverGrade (ArrayList<Student> al, double grade) {
//        for (Student student : al) {
//            if (student.averageGrade > grade) {
//                System.out.println(student);
//            }
//        }
//
//    }
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student student : al) {
//            if (student.age < age) {
//                System.out.println(student);
//            }
//        }
//
//    }
//    void printStudentsMixCondition (ArrayList<Student> al,int age, double grade, char sex ) {
//        for (Student student : al) {
//            if (student.age > age && student.averageGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }

        class Test {
            public static void main(String[] args) {
                Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
                Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
                Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
                Student st4 = new Student("Petr", 'm', 35, 4, 7);
                Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

                ArrayList<Student> students = new ArrayList<>();
                students.add(st1);
                students.add(st2);
                students.add(st3);
                students.add(st4);
                students.add(st5);

                StudentInfo info = new StudentInfo();


                Function<Student, Double> f = student -> student.averageGrade;
                double res = avgOfSmth(students, student -> (double) student.course);
                System.out.println(res);

            }
            private  static  double avgOfSmth (List<Student> list, Function<Student, Double> f) {
                double result = 0;
                for (Student student : list) {
                    result+=f.apply(student);
                }
                result = result / list.size();
                return result;

            }
}
//            Collections.sort(students, new Comparator<Student>() {
//                @Override
//                public int compare(Student s1, Student s2) {
//                    return s1.course - s2.course; // вот тт так как и
//                }
//            });
//            Collections.sort(students, (stud1,stud2) -> stud1.course - stud2.course); // тут
//            System.out.println(students);

//            info.testStudents(students, new CheckOverGrade());
//            System.out.println("------------");
//            info.testStudents(students, new StudentChecks() {
//                @Override
//                public boolean check(Student s) {
//                    return s.age<30;
//                }
//            }); // одинаково здесь

//            info.testStudents(students, (Student s) -> {
//                return s.averageGrade > 8;
//            }); // одинаково
//
//            info.testStudents(students, (s) -> s.averageGrade > 8); // одинаково, но сокращенно
//
//            info.testStudents(students, (Student s) -> {
//                System.out.println("hello");
//                return s.averageGrade > 8;
//            }); // тоже самое
//
//
//
//                Predicate <Student> p1 = student ->  student.averageGrade > 7.5;
//            Predicate <Student> p2 = student ->  student.sex == 'm';
//            info.testStudents(students,p1);
//            info.testStudents(students, p2);
////           /*либо по отдельности либо вместе (and)/ (or)или две проверки*/
//            info.testStudents(students, p1.or(p2));
//            info.testStudents(students, p1.negate());// отрицание / противоположность условия

//             sc = (Student s) -> {return s.averageGrade > 8;}; // еще один вариант написания
//            info.testStudents(students, sc); // это ужа само по себе lambda выражение как на верху

//            System.out.println("------------");
//            info.testStudents(students, (Student s) -> {
//                return s.age < 30;
//            }); // и одинаково здесь
//            System.out.println("------------");
//            info.testStudents(students, (Student s) -> {
//                return s.age > 20 && s.averageGrade < 9.3 && s.sex == 'f';
//            });

//            info.printStudentsOverGrade(students,8);
//            System.out.println("----------------------");
//            info.printStudentsUnderAge(students,30);
//            System.out.println("----------------------");
//            info.printStudentsMixCondition(students,20,9.5,'f');
//
//        }

//interface StudentChecks {
//    boolean check (Student s);
//}
//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.averageGrade > 8;
//    }
//}