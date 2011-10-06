package hw02.group04;

public class MallardDuck extends Duck {

	@Override
	public String display() {
		return "I'm a real Mallard duck";
	}

	@Override
	public String fly() {
		return isEquippedWithRocket ? "I'm flying with a rocket" : "I'm flying!!";
	}

	@Override
	public String quack() {
		return "Quack";
	}

}
