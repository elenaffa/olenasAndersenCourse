package school.lesson3;

public class Employee {
    public String name;
    public String position;
    public String email;
    public String phone;
    public double salary;
    public int age;


    public Employee(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }


    public void showInfo() {
        System.out.print("ФИО: " + name + "\nдолжность: " + position + "\nemail: " + email + "\nтелефон: " + phone + "\nзарплата: " + salary + "\nвозраст: " + age + "\n");
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Kowalski Jan", "Lead Engineer", "jankowalski@mailbox.com", "690665326", 48000, 43);
        persArray[2] = new Employee("Sydorov Stepan", "Engineer", "sydorov.stepan@mailbox.com", "776360996", 29000, 28);
        persArray[3] = new Employee("Popova Iryna", "Senior Engineer", "ir_popova@mailbox.com", "663805245", 43000, 41);
        persArray[4] = new Employee("Petrov Petr", "Junior Engineer", "ppetrov@mailbox.com", "598275006", 15000, 20);

        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].showInfo();
    }
}


