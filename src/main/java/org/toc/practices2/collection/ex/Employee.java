package org.toc.practices2.collection.ex;

import java.util.Objects;

//public class Employee implements Comparable<Employee> {
public class Employee {
    String id;
    String name;

    Employee(String _id, String _name) {
        id = _id;
        name = _name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        return o.getName().compareTo(this.getName());
//    }
}