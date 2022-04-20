import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "Expected car to have a model");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		car.start();
		
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "Expected car to start");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;
		car.lowerTop();
		boolean isTopLowered = car.isTopDown;
		assertTrue(isTopLowered, "Expected top to lower");
		assertFalse(car.isTopUp, "Top cannot be lowered and raised at same time");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.Car;
		car.raiseTop();
		boolean isTopRaised = car.isTopUp;
		assertTrue(isTopRaised, "Expected top to be raised");
		assertFalse(car.isTopDown, "Top cannot be lowered and raised at same time");
	}
}
