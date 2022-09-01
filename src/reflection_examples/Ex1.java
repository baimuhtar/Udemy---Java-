package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection_examples.Employee"); // 1
       /* Class employeeClass2 = Employee.class; // 2
        Employee emp = new Employee(); // 3
        Class employeeClass3 = emp.getClass();*/ // 3

        Field someField = employeeClass.getField("id");
        System.out.println("type of id field = " + someField.getType());
        System.out.println("---------------");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("---------------");
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("---------------");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("---------------");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("---------------");

        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of Method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("---------------");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of Method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("---------------");
        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers()))
                System.out.println("Name of Method = " + method.getName() +
                        ", return type = " + method.getReturnType() +
                        ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("---------------");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their type are: " +
                Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("---------------");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their type are: " +
                Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("---------------");
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() + " has " + constructor.getParameterCount() +
                    " parameters, their type are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }
        System.out.println("---------------");
        Constructor[] constructors2 = employeeClass.getDeclaredConstructors();
        for (Constructor constructor : constructors2) {
            System.out.println("Constructor " + constructor.getName() + " has " + constructor.getParameterCount() +
                    " parameters, their type are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }
    }
}