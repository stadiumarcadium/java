package lesson06;

public abstract class Animal {

    public int maxRunDistance;
    public int maxSwimDistance;
    private static int amount;

    public Animal(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        amount++;
    }

    public abstract String run(int runDistance);

    public abstract String swim(int swimDistance);

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal:" + this.getClass().getSimpleName() +
                "{maxRunDistance=" + maxRunDistance +
                ", maxSwimDistance=" + maxSwimDistance +
                '}';
    }

    public static int getAmount() {
        return amount;
    }

}
