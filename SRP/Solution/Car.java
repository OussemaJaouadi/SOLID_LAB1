public class Car {
    private String _id;
    private String _model;
    private String _brand;
  
    public Car(String id, String model, String brand) {
      _id = id;
      _model = model;
      _brand = brand;
    }
  
    public String getId() {
      return _id;
    }
  
    public String getModel() {
      return _model;
    }
  
    public String getBrand() {
      return _brand;
    }
  }
  