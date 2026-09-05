public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
}

    class Manager extends Employee {
        private double bonus;

        public Manager(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        @Override
        void display() {
            double totalPay = getSalary() + bonus;
            System.out.println("Manager: " + getName() + " | Total Pay: $" + totalPay);
        }
    }


public class Main {
    public static void main(String[] args) {
        Manager A = new Manager("Ani", 4000, 200);
        A.display();
    }
}


