package lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, boolean satiety, String name, Cat cat) {
        if ((food -= n) < 0) {
           System.out.printf("Для кота %s не хватает еды " + food * (-1) +"\n" + "Добавте еды\n", name);
            increaseFood();
            food -=n;
            cat.setSatiety(true);
        } else { satiety = true;
            food -=n;
            cat.setSatiety(true);
       }

    }
    void increaseFood() {
        this.food += 100;
        System.out.println("В миску добавили 100 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}


