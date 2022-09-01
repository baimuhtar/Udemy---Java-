package work_with_files.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
   String surname;
    String department;
    //int age;
    transient double salary;
    Car car;

    public Employee(String name,
                   String surname,
                    String department,
                   // int age,
                    double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        //this.age = age;
        this.salary = salary;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                 "surname= " + surname +
                ", department='" + department + '\'' +
                //", age=" + age +
                ", salary=" + salary +
                " Car " + car +
                '}';
    }
}
