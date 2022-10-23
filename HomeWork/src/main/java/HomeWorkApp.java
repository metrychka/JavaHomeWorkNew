public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords(); // комментарий
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = -20;
        int b = 9;
        int c;
        c = a + b;

        if (c >=0 ) {
            System.out.println("Сумма положительная");
        }
        else  {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int vaiue = 100;
        if (vaiue <=0 ) {
            System.out.println("Красный");
        }
        else if (vaiue > 0 && vaiue <= 100) {
            System.out.println("Желтый");
        }
        else if (vaiue >100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 78;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }


}
