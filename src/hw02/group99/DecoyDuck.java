package hw02.group99;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public String display() {
        return "I'm a duck Decoy";
    }
}
