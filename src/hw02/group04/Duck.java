package hw02.group04;

public abstract class Duck {

	protected boolean isEquippedWithRocket = false;
	
	public abstract String display();
	public abstract String fly();
	public abstract String quack();
	
	public String swim() {
		return "All ducks float, even decoys!";
	}
	
	public void useRocket() {
		isEquippedWithRocket = true;
	}

}
