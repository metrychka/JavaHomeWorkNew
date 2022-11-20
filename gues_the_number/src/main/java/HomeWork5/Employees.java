package HomeWork5;

public class Employees {
    String fio;
    String job;
    String email;
    int tel;
    int salary;
    int age;

    void printInfo() {
        System.out.println(String.format("Сотрудник %s в должности %s с электронным адресом %s номер телефона %s зарплата %s и возраст %s лет" ,fio,job,email, tel, salary,age ));
    }

    public Employees(String fio, String job, String email, int tel, int salary, int age) {
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public Employees() {
     this("Не указано", "инженер", "не известно", 30, 0, 0);

    }

}
