public class Manager {
    public void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }
}
