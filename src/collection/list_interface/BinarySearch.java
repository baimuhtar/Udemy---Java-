package collection.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);


//        Collections.sort(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);

        Employee e1 = new Employee(100,"Zaur",12345);
        Employee e2 = new Employee(20, "Ivan", 6542);
        Employee e3 = new Employee(123, "Petr",8542);
        Employee e4 = new Employee(30,"Mariya",5678);
        Employee e5 = new Employee(182,"Kolya",125);
        Employee e6 = new Employee(15, "Sasha", 9874);
        Employee e7 = new Employee(250, "Elena",1579);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(182,"Kolya",125) );
        System.out.println(index2);

        int [] array = {-5,8,100,-94,30,1,45,6,8,1332};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array,150);
        System.out.println(index3);



    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result==0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
