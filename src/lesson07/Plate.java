package lesson07;

public class Plate {

    public int food;

    public Plate(int food) { this.food = food; }

    public int getFood() { return food; }

    public void minusFood(int appetite) {
        this.food -= appetite;
    }

    public void plusFood(int food) { this.food += food; }

}