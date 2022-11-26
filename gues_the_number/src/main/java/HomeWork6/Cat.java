package HomeWork6;

public class Cat extends Animal {
    static int count;
    private String name;
    private int run;

    private String animalClass;

    public Cat(String name, int run, String animalClass) {
        super();
        this.name = name;
        setRun(run);
        this.animalClass = animalClass;
        count ++;
    }
    void printInfo() {
        System.out.printf("котик %s пробежал %s м\n" , name, run);
    }

    public void setRun(int run) {
        if (run <= 200) {
            this.run = run;
        } else {
            System.out.printf("Введено некорректное число длины бега для кота %s! Укажите число меньше 200!\n", name);
            System.exit(0);
        }
    }

}
