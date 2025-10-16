package school_facade;

public class SchoolFacade {
    private Teacher teacher;
    private Accountant accountant;
    private Secretary secretary;

    public SchoolFacade() {
        this.teacher = new Teacher();
        this.accountant = new Accountant();
        this.secretary = new Secretary();
    }

    public void startSchoolDay() {
        System.out.println("SchoolFacade: Starting school day");
        secretary.doWork();
        teacher.doWork();
        accountant.doWork();
        System.out.println("SchoolFacade: Day successfully started!");
    }
}
