public class TimedDoor implements Openable, Lockable, TimeoutAware {
    private boolean locked;
    private boolean opened;
    private Timer timer;

    public TimedDoor(Timer timer) {
        this.timer = timer;
        this.locked = true;
        this.opened = false;
    }

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public void open() {
        if (!locked) {
            opened = true;
            timer.register(5000, this);
        }
    }

    public void close() {
        opened = false;
    }

    public void timeOutCallback() {
        // Implementation for timeout callback
    }
}