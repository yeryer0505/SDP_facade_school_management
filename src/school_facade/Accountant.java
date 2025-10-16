package school_facade;

public class Accountant implements IJob {
    @Override
    public void doWork() {
        System.out.println("Accountant: Managing payments");
    }
}
