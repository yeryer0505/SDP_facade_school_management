package school_facade;

public class SchoolFacade {
    private Teacher teacher;
    private Accountant accountant;
    private Secretary secretary;

    private String name;
    private String startMessage;
    private String endMessage;

    public SchoolFacade() {
        this.teacher = new Teacher();
        this.accountant = new Accountant();
        this.secretary = new Secretary();
        this.name = "SchoolFacade";
        this.startMessage = "Starting school day";
        this.endMessage = "Day successfully started!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartMessage() {
        return startMessage;
    }

    public void setStartMessage(String startMessage) {
        this.startMessage = startMessage;
    }

    public String getEndMessage() {
        return endMessage;
    }

    public void setEndMessage(String endMessage) {
        this.endMessage = endMessage;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void startSchoolDay() {
        System.out.println("SchoolFacade" + ": " + startMessage);
        secretary.doWork();
        teacher.doWork();
        accountant.doWork();
        System.out.println(name + ": " + endMessage);
    }
}
