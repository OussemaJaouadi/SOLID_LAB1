public class ElectronicDuck implements Duck {
    private boolean on;

    public void turnOn() {
        on = true;
        // Implementation for turning on electronic duck
    }

    public void turnOff() {
        on = false;
        // Implementation for turning off electronic duck
    }

    @Override
    public void quack() {
        if (on) {
            // Implementation for electronic duck quacking
        }
    }

    @Override
    public void swim() {
        if (on) {
            // Implementation for electronic duck swimming
        }
    }
}
