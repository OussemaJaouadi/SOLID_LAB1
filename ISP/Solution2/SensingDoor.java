public class SensingDoor implements Openable, ProximityAware {
    private boolean locked;
    private boolean opened;
    private Sensor sensor;

    public SensingDoor(Sensor sensor) {
        this.sensor = sensor;
        this.locked = true;
        this.opened = false;
    }

    public void open() {
        if (!locked) {
            opened = true;
        }
    }

    public void close() {
        opened = false;
    }

    public void proximityCallback() {
        if (!opened && !locked && sensor.isPersonClose()) {
            open();
        }
    }
}
