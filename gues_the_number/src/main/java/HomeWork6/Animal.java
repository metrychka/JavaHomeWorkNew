package HomeWork6;

public class Animal {
   private String name;
   private int run;
   private int swim;
   private String animalClass;

   public Animal() {
      this.name = name;
      this.run = run;
      this.swim = swim;
      this.animalClass = animalClass;
   }
   void printInfo() {
      System.out.printf("животное %s зовут %s", animalClass, name);
   }
}

