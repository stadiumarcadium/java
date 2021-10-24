package lesson06;

import java.util.Random;

public class RunSwim {

    public static void main(String[] args) {
        Animal[] animals = createAnimal();
        runSwim(animals);
    }

//    private static int[] generateChallange() {
//       Random random = new Random();
//       return new int[]{random.nextInt(1000),random.nextInt(20)};
//    }

    private static Animal[] createAnimal() {
        return new Animal[]{
                new Dog(Dog.MAX_RUN_DISTANCE, Dog.MAX_SWIM_DISTANCE),
                new Dog(Dog.MAX_RUN_DISTANCE, Dog.MAX_SWIM_DISTANCE),
                new Dog(Dog.MAX_RUN_DISTANCE, Dog.MAX_SWIM_DISTANCE),
                new Cat(Cat.MAX_RUN_DISTANCE, Cat.MAX_SWIM_DISTANCE),
                new Cat(Cat.MAX_RUN_DISTANCE, Cat.MAX_SWIM_DISTANCE),
                new Cat(Cat.MAX_RUN_DISTANCE, Cat.MAX_SWIM_DISTANCE)
        };
    }

    public static void runSwim(Animal[] animals) {
        Random random = new Random();
        for (Animal animal : animals) {
            animal.printInfo();
            System.out.println(animal.run(random.nextInt(1000)));
            System.out.println(animal.swim(random.nextInt(20)));
            System.out.println();
        }
        System.out.printf("Всего животных %d.", Animal.getAmount());
    }

}
