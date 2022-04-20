public class ConvertibleCar extends Car implements ICar {
	protected boolean isTopDown;
	protected boolean isTopUp;

	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}
	public boolean lowerTop() {
		isTopDown = true;
		isTopUp = false;
		return isTopDown;
	}
	public boolean raiseTop() {
		isTopDown = false;
		isTopUp = true;
		return isTopUp;
	}
	
}
