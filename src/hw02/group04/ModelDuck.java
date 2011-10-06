package hw02.group04;

public class ModelDuck extends Duck {

	@Override
	public String display() {
		 return "I'm a model duck";
	}

	@Override
	public String fly() {
		return isEquippedWithRocket ? "I'm flying with a rocket" : "I can't fly";
	}

	@Override
	public String quack() {
		return "Quack";
	}

}
