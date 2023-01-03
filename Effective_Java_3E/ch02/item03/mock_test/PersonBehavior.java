package ch02.item03.mock_test;

public class PersonBehavior {

    private boolean moveBehavior;

    private boolean runBehavior;

    private Person person;

    public PersonBehavior(Person person) {
        this.person = person;
    }

    public void startAll() {
        moveBehavior = true;
        runBehavior = true;
        person.move();
        person.run();
    }

    public boolean isMoveBehavior() {
        return moveBehavior;
    }

    public boolean isRunBehavior() {
        return runBehavior;
    }
}
