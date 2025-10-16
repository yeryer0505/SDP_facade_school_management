package school_facade;

public class Secretary implements IJob {
    @Override
    public void doWork() {
        System.out.println("Secretary: Registering new students");
    }
}
