package lesson05;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892112333", 30000, 30);
        persArray[1] = new Employee("Nikitin Sergey", "Engineer", "nikitin@mailbox.com", "892312322", 40000, 35);
        persArray[2] = new Employee("Krylov Oleg", "Teacher", "okrylov@mailbox.com", "892332312", 50000, 40);
        persArray[3] = new Employee("Elena Sergeeva", "Engineer", "esergeeva@mail.ru", "894312352", 60000, 45);
        persArray[4] = new Employee("Vladimir Putin", "janitor", "putin1981@mail.ru", "892342352", 70000, 50);

        for (Employee employee : persArray) {
            if (employee.getAge() > 40)
                employee.printInfo();
        }
    }


}
