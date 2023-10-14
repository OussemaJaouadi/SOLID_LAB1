import java.util.ArrayList;
import java.util.List;

public class CarManager {
  private List<Car> cars;

  public CarManager() {
    cars = new ArrayList<>();
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public List<Car> getCars() {
    return cars;
  }
}
