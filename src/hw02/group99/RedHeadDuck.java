package hw02.group99;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public String display() {
        return "I'm a real Red Headed duck";
    }
}
