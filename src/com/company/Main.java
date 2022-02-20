package com.company;

import javax.swing.plaf.IconUIResource;
import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Cow cow1 = new Cow(200, (byte) 4, "Reina", 'F');
        Cow cow2 = new Cow(182, (byte) 4, "Mumu", 'M');
        Cow cow3 = new Cow(145, (byte) 2, "Mayka", 'F');
        Cow cow4 = new Cow(238, (byte) 6, "Avrora", 'M');
        Cow cow5 = new Cow(172, (byte) 5, "Altayka", 'M');
        Cow cow6 = new Cow(177, (byte) 4, "Babet", 'F');

        Sheep sheep1 = new Sheep(45, (byte) 3, "Solnse", 'M');
        Sheep sheep2 = new Sheep(67, (byte) 5, "Mars", 'F');
        Sheep sheep3 = new Sheep(53, (byte) 4, "Shaulin", 'M');
        Sheep sheep4 = new Sheep(67, (byte) 5, "Kurcho", 'M');

        Horse horse1 = new Horse(304, (byte) 7, "Voron", 'F', "White");
        Horse horse2 = new Horse(296, (byte) 6, "Barhat", 'M', "Black");
        Horse horse3 = new Horse(316, (byte) 4, "Morgana", 'F', "Brown");


        DomesticAnimals[] animals = {cow1, cow2, cow3, cow4, cow5, sheep1, sheep2, sheep3, horse1, horse2};
        DomesticAnimals[] animals1 = {cow6, sheep4, horse3};

        Cow[] cows = new Cow[5];
        Cow[] cow = new Cow[1];
        Sheep[] sheep = new Sheep[3];
        Sheep[] sheeps = new Sheep[1];
        Horse[] horses = new Horse[2];
        Horse[] horse = new Horse[1];

        int countOfCows = 0;
        int countOfSheep = 0;
        int countOfHorse = 0;

        for (DomesticAnimals i : animals) {
            if (i instanceof Cow) {
                cows[countOfCows] = (Cow) i;
                countOfCows++;
            }
            if (i instanceof Sheep) {
                sheep[countOfSheep] = (Sheep) i;
                countOfSheep++;
            }
            if (i instanceof Horse) {
                horses[countOfHorse] = (Horse) i;
                countOfHorse++;

                int countOfCow2 = 0;
                int countOfSheep2 = 0;
                int countOfHorse2 = 0;

                for (DomesticAnimals b : animals1) {
                    if (b instanceof Cow) {
                        cow[countOfCow2] = (Cow) b;
                        countOfCow2++;
                    }
                    if (b instanceof Sheep) {
                        sheep[countOfSheep2] = (Sheep) b;
                        countOfSheep2++;
                    }
                    if (b instanceof Horse) {
                        horse[countOfHorse2] = (Horse) b;
                        countOfHorse2++;
                    }
                }

                Farm farm1 = new Farm("Karkyra", cows, horses, sheeps, "Kyial");
                Farm farm2 = new Farm("Saruu", cow, horse, sheep,"Nurbek");

                System.out.println(farm1);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(farm2);
            }
        }
    }
}

//        Класс Cow (weight, age, gender, nickName)
//        Класс Sheep(weight, age, gender, nickName)
//        Класс Horse(weight, age, color, gender, nickName)
//        Класс Farm(address, cows, horses, sheep, OwnerName)
//        Farm тузунуз.
//        1-Farmда 3 sheep, 5 cows, 2 horses болсун.
//        2-Farmда 1 sheep, 1 cow, 1 horse болсун.

