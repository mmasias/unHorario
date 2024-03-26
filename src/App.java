public class App {    
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    private void start() {

        Schedule schedule = new Schedule();
        Subject subject;

        subject = new Subject("Programacion 1", "PRG1", 6);
        schedule.addSubject(subject, 1, 1);
        schedule.addSubject(subject, 1, 2);

        subject = new Subject("Matemática 1", "MAT1", 6);
        schedule.addSubject(subject, 2, 1);
        schedule.addSubject(subject, 2, 2);

        subject = new Subject("Proyectos");
        schedule.addSubject(subject, 4, 2);

        System.out.println(schedule.show());
    }

}
