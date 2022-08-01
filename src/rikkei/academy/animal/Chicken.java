package rikkei.academy.animal;

import rikkei.academy.edible.IEdible;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "Chicken : Cuc toaccccccccccc !!!!!!!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
