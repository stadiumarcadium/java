package lesson07;

import java.util.Scanner;

public class Eating {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Василий", 7),
                new Cat("Рыжик", 8),
                new Cat("Пушистик", 6)};
        Plate plate = new Plate(0);
        plusFood(plate);
//        createCats();
        printInfo(cats, plate);
        eating(cats, plate);
        System.out.println("В тарекле осталось еды: " + plate.food);
    }

//    private static Cat[] createCats() {
//        Cat[] cats = {
//                new Cat("Василий", 7),
//                new Cat("Рыжик", 8),
//                new Cat("Пушистик", 6)};
//        return cats;
//    }

    public static void plusFood(Plate plate) {
        System.out.println("Сколько положить корма в тарелку: ");
        Scanner scanner = new Scanner(System.in);
        plate.plusFood(scanner.nextInt());
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println();
        System.out.println("В тарелке еды: " + plate.food);
        System.out.println();
        printCats(cats);
        System.out.println();
    }

    private static void printCats(Cat... cats) {
        for (Cat cat : cats) {
            System.out.printf("Кот '%s(аппетит: %d)' голодный? : %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.getFullness());
        }
    }

    private static void eating(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
             System.out.printf("Кот '%s' поел? : %s%n", cat.getName(), cat.eat(plate));
        }
        System.out.println();
    }
}
