import java.util.Scanner;

abstract class Member {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public abstract double printSalary();
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }

    public double printSalary() {
        return salary;
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }

    public double printSalary() {
        return salary;
    }
}

public class lab6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee1;
        Manager m1;

        System.out.println("Enter employee's name:");
        String empName = sc.nextLine();
        System.out.println("Enter employee's age:");
        int empAge = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.println("Enter employee's phoneNumber:");
        String empPhone = sc.nextLine();
        System.out.println("Enter employee's address:");
        String empAddress = sc.nextLine();
        System.out.println("Enter employee's specialization:");
        String empSpecialization = sc.nextLine();
        System.out.println("Enter employee's salary:");
        double empSalary = sc.nextDouble();

        employee1 = new Employee(empName, empAge, empPhone, empAddress, empSalary, empSpecialization);

        sc.nextLine(); // Consume newline character

        System.out.println("Enter manager's name:");
        String managerName = sc.nextLine();
        System.out.println("Enter manager's age:");
        int managerAge = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.println("Enter manager's phoneNumber:");
        String managerPhone = sc.nextLine();
        System.out.println("Enter manager's address:");
        String managerAddress = sc.nextLine();
        System.out.println("Enter manager's department:");
        String managerDepartment = sc.nextLine();
        System.out.println("Enter manager's salary:");
        double managerSalary = sc.nextDouble();

        m1 = new Manager(managerName, managerAge, managerPhone, managerAddress, managerSalary, managerDepartment);

        System.out.println("\n---Employee Details---");
        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Phone: " + employee1.phone);
        System.out.println("Address: " + employee1.address);
        System.out.println("Specialization: " + employee1.specialization);
        System.out.println("Salary: " + employee1.printSalary());

        System.out.println("\n---Manager Details---");
        System.out.println("Name: " + m1.name);
        System.out.println("Age: " + m1.age);
        System.out.println("Phone: " + m1.phone);
        System.out.println("Address: " + m1.address);
        System.out.println("Department: " + m1.department);
        System.out.println("Salary: " + m1.printSalary());
    }
}
