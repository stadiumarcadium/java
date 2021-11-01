package lesson06;

public class Cat extends Animal {

    public static final int MAX_RUN_DISTANCE = 500;
    public static final int MAX_SWIM_DISTANCE = 10;


    public Cat(int maxRunDistance, int maxSwimDistance) {
        super(MAX_RUN_DISTANCE, MAX_SWIM_DISTANCE);
    }

    @Override
    public String run(int runDistance) {
        if (this.maxRunDistance >= runDistance) {
            System.out.print("Кот пробежал ");
        } else
            System.out.print("Кот не смог пробежать заданную дистанцию ");
//        return false;
        return Integer.toString(runDistance) + "м.";
    }

    @Override
    public String swim(int distance) {
        return "Кот не умеет плавать.";
    }
}
