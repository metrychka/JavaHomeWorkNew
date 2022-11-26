package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Василий", 100,  "кот");
        Cat cat2 = new Cat("Бариск", 100,  "кот");
        Dog dog1 = new Dog("Бобик",10, 10, "собака");
        Dog dog2 = new Dog("Тузик", 100, 5, "собака");
        Dog dog3 = new Dog("Снежок", 100, 5, "собака");
        cat1.printInfo();
        dog1.printInfo();
        cat2.printInfo();
        dog2.printInfo();
        dog2.printInfo();
        System.out.println("количество котов: " + Cat.count);
        System.out.println("количество собак: " + Dog.count);
    }
}
