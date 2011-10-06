package hw02.group04;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public void useRocket() {
        flyBehavior = new FlyRocketPowered();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract String display();

    public String fly() {
        return flyBehavior.fly();
    }

    public String quack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return "All ducks float, even decoys!";
    }
}
