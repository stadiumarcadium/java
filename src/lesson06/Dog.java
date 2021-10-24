package lesson06;

public class Dog extends Animal {

    public static final int MAX_RUN_DISTANCE = 500;
    public static final int MAX_SWIM_DISTANCE = 10;


    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(MAX_RUN_DISTANCE, MAX_SWIM_DISTANCE);
    }

    @Override
    public String run(int runDistance) {
        if (this.maxRunDistance >= runDistance) {
            System.out.print("Собака пробежала");
        } else System.out.print("Собака не смогла пробежать заданную дистанцию");
        return Integer.toString(runDistance)+"м.";
    }

    @Override
    public String swim(int swimDistance) {
        if (this.maxSwimDistance >= swimDistance) {
            System.out.print("Собака проплыла");
        } else {
            System.out.print("Собака не смогла проплыть заданную дистанцию");
        }
        return Integer.toString(swimDistance)+"м.";
    }
}
