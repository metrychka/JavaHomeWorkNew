package HomeWork5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employees employees1 = new Employees("Иванов Иван Иванович", "аналитик", "ivanov@mail.com", 78996544, 450000, 25);
        Employees employees2 = new Employees();
        Employees employees3 = new Employees("Иванова Анжела Сергеевна", "бухгалтер", "ivanovа@mail.com", 78996544, 550000, 35);
        Employees employees4 = new Employees("Попов Сергей Владвимирович", "системный администратор", "popov@mail.com", 78996544, 700000, 29);
        employees1.printInfo();
        employees2.printInfo();
        employees3.printInfo();
        employees4.printInfo();
        System.out.println();

            Employees[] empArray = new Employees[5];
            empArray[0] = new Employees("Иванов Иван Иванович", "аналитик", "ivanov@mail.com", 78996544, 450000, 25);
            empArray[1] = new Employees("Иванова Анжела Сергеевна", "бухгалтер", "ivanovа@mail.com", 78996544, 550000, 35);
            empArray[2] = new Employees("Попов Сергей Владвимирович", "системный администратор", "popov@mail.com", 78996544, 700000, 29);
            empArray[3] = new Employees("Медведев Игорь Владимирович", "генеральный директор", "medved@mail.com", 78996544, 1700000, 50);
            empArray[4] = new Employees("Соловьева Маргарита Ивановна", "главный бухгалтер", "soloviova@mail.com", 78996544, 1500000, 45);
            for (int i = 0; i < 5; i++) {
                if (empArray[i].age> 40)
                {
                    empArray[i].printInfo();
                }
            }
        }
    }
