package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(whatNumber(0, 3));
        positivNumber(14569);
        System.out.println(negativNumber(80));
        LineNumber("ый раз передается срока",1 );

    }

    static boolean whatNumber(int a, int b)

    {
        if ((a + b) >= 10 && (a + b) <= 20) {
            System.out.println("Сумма числа в пределах от 10 до 20");
            return false;
        }
        else {
            System.out.println("Сумма числа не в пределах от 10 до 20");
                        return true;
        }
    }

    public static void positivNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число а: " + a);
        }
        else {
            System.out.println("Отрицательное число а: " + a);
        }
    }
    public static boolean negativNumber(int a) {
        if (a < 0) {
            return true;

        } else {
        return false;}
    }
    public static void LineNumber(String word, int i) {
        for (; i< 15;i++) {
            System.out.println(i + word);
        }
    }
}