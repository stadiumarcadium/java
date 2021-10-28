package lesson07;

public class Cat {

    private final String name;

    private boolean fullness;

    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean getFullness() {
        return fullness;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public boolean eat(Plate plate) {
        if (checkEat(plate) != null) {
            System.out.println(checkEat(plate));
            return false;
        }
        plate.minusFood(appetite);
        fullness = true;
        return true;
    }

    private String checkEat(Plate plate) {
        if (appetite > plate.food) return "Мало еды!";
        if (fullness) return "Кот уже сыт.";
        return null;
    }

}
