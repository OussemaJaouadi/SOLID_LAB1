import java.util.ArrayList;
import java.util.List;

public class CarNamesProvider {
  private CarManager carManager;

  public CarNamesProvider(CarManager carManager) {
    this.carManager = carManager;
  }

  public List<String> getCarNames() {
    List<String> carNames = new ArrayList<>();
    for (Car car : carManager.getCars()) {
      carNames.add(car.getModel());
    }
    return carNames;
  }
}
