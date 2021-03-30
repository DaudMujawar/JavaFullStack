package collection;

import java.util.ArrayList;
import java.util.List;

public class Employee1 {
    int id;
    String name;
    String address;

    public Employee1(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee1 employee1 = new Employee1(1, "Mohan", "Miraj");
        Employee1 employee2 = new Employee1(2, "Uday", "Punadi");
        Employee1 employee3 = new Employee1(3, "Daud", "Sangli");

        List<Employee1> list1 = new ArrayList<>();
        list1.add(employee1);
        list1.add(employee2);
        list1.add(employee3);

        list1.forEach(s -> {
            System.out.println("Id:" + s.id);
            System.out.println("Name:" + s.name);
            System.out.println("Address:" + s.address);

        });
    }

}
