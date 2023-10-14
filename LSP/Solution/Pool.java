public class Pool {
    public void run() {
        Manager manager = new Manager();
        Duck donaldDuck = new RegularDuck();
        Duck electricDuck = new ElectronicDuck();
        manager.quack(donaldDuck, electricDuck);
        manager.swim(donaldDuck, electricDuck);
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }