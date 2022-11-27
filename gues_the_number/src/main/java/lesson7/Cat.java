package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }
   public void eat (Plate plate, boolean satiety, Cat cat) {
       // plate.decreaseFood(appetite, satiety, name);
       plate.decreaseFood(cat.appetite, cat.satiety, cat.name, cat);
   }

    public String toString() {
        return name;
    }
}
