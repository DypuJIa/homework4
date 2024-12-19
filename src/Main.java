import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1" + "\n");
        int age = 20;
        if (age > 18) {
            System.out.println("Если возраст человека равен," + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен, " + age + " то он не совершеннолетний ");
        }

        System.out.println("Задача №2" + "\n");
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градуса, нужно надеть шапку ");
        } else {
            System.out.println("На улице " + temp + " градуса, можно идти без шапки ");
        }

        System.out.println("Задача №3" + "\n");
        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }

        System.out.println("Задача №4" + "\n");

        int age1 = 26;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        }
        boolean canInGoToSchool = age1 >= 7 && age1 <= 17;
        if (canInGoToSchool) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        boolean сanInGoToUniversity = age1 >= 18 && age1 <= 24;
        if (сanInGoToUniversity) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        }
        boolean canInGoToJob = age1 > 24;
        if (canInGoToJob) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        }


        System.out.println("Задача №5" + "\n");

        int child = 14;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + " ,то ему нельзя кататься на аттракционе");
        } else {
            if (child >= 5 && child <= 14) {
                System.out.println("Если возраст ребенка равен " + child + " ,то ему можно можно кататься на аттракционе в сопровождении взрослого");
            } else if (child > 14) {
                System.out.println("Если возраст ребенка равен " + child + " ,то ему можно можно кататься на аттракционе без сопровождения взрослого");

            }
        }
        System.out.println(" Задача №6" + "\n");

        int carriageCapacity = 102;
        int seatsCount = 60;
        int standingPlaces = carriageCapacity - seatsCount;
        int peopleInCarriage = 80;


        if (peopleInCarriage < carriageCapacity) {
            System.out.println(" есть места");
        } else {
            System.out.println(" нет мест ");
        }
        if (peopleInCarriage < seatsCount) {
            System.out.println("Есть сидячие места.");
        } else {
            System.out.println("Есть стоячие места.");
        }
        if (peopleInCarriage == carriageCapacity) {
            System.out.println("Вагон полностью забит.");
        }

        System.out.println(" Задача №7");

        int one = 10;
        int two = 20;
        int three = 16;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            System.out.println("Число " + three + " больше остальных");
        }


    }
}