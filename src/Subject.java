public class Subject {

    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String show() {
        return name + " [" + credits + "]";
    }

    public String showCode() {
        return code;
    }

    public static void main(String[] args) {

        Subject subject;
        subject = new Subject("Programación 2", "PRG2", 6);
        System.out.println(subject.show());
    }
}