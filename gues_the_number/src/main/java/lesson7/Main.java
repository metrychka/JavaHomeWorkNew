package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Барсик", 10, false);
    Cat cat2 = new Cat("Горчица", 2, false);
    Cat cat3 = new Cat("Сажик", 4, false);
    Plate plate = new Plate(19);
    Cat [] catArrays = {cat1, cat2, cat3};

      // cat1.eat(plate, cat1.isSatiety());
       //cat2.eat(plate, cat2.isSatiety());
      // cat3.eat(plate, cat3.isSatiety());
 for (int i = 0; i < catArrays.length; i ++ ) {
     if (catArrays[i].isSatiety() == false) {
         catArrays[i].eat(plate, catArrays[i].isSatiety(), catArrays[i]);
         if (catArrays[i].isSatiety() == true) {
             System.out.println("Котик " + catArrays[i] + " покушал");
         } else {
             System.out.println("Котик " + catArrays[i] + " не покушал");
         }
     } else {
         System.out.println("Котик " + catArrays[i] + " не покушал");
    }
     System.out.println((catArrays[i].isSatiety()));
 }

    }
}
