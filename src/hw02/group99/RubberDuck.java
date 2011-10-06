package hw02.group99;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public String display() {
        return "I'm a rubber duckie";
    }
}
