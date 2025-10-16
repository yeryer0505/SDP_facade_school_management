package school_facade;

public class Teacher implements IJob {
    private String action;
    private String name;

    public Teacher() {
        this.name = "Teacher";
        this.action = "Teaching students";
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + ": " + action);
    }
}