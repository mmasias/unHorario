public class Subject {

    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits) {
        assert name!=null && code.length()==4 && credits >=0;

        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public Subject(String name){
        this(name,name.substring(0, 4).toUpperCase(),0);
    }

    public String show() {
        return name + " [" + credits + "]";
    }

    public String showCode() {
        return code;
    }

    public static void main(String[] args) {

        Subject subject;
        subject = new Subject("Programación 2");
        System.out.println(subject.show());
        System.out.println(subject.showCode());
    }
}