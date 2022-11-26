package HomeWork6;

public class Dog extends Animal {
    static int count;
    private String name;
    private int run;
    private int swim;
    private String animalClass;

    public Dog(String name, int run, int swim, String animalClass) {
        super();
        this.name = name;
        setRun(run);
        setSwim(swim);
        this.animalClass = animalClass;
        count ++;
    }
    void printInfo() {
        System.out.printf("собака %s пробежал %s м и проплыл %s м\n" , name, run, swim);
    }
    public void setRun(int run) {
            if (run <= 500) {
            this.run = run;
        } else {
            System.out.printf("Введено некорректное число длины бега для собаки %s! Укажите число меньше или равно 500!\n", name);
            System.exit(0);
        }
    }

    public void setSwim(int swim) {
        if (swim <= 10) {
            this.swim = swim;
        } else {
            System.out.printf("Введено некорректное число длины плавания для собаки %s! Укажите число меньше или равно 10!\n", name);
            System.exit(0);
        }
    }
}
