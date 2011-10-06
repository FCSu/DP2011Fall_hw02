package hw02.group99;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public String display() {
        return "I'm a model duck";
    }
}
