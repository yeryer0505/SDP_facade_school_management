package school_facade;

public class Teacher implements IJob {
    @Override
    public void doWork() {
        System.out.println("Teacher: Teaching students");
    }
}
