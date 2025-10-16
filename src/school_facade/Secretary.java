package school_facade;

public class Secretary implements IJob {
    private String name;
    private String action;

    public Secretary() {
        this.name = "Secretary";
        this.action = "Registering new students";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public void doWork() {
        System.out.println(name + ": " + action);
    }
}
