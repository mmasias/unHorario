public class Schedule {
    
    private Subject[][] subjects;

    public Schedule(){
        subjects = new Subject[5][8];
    }

    public void addSubject(Subject subject, int day, int hour) {
        subjects[day-1][hour-1] = subject;
    }

    public String show() {
        String schedule = "";
        for (int hour = 0; hour < 8; hour++) {
            for (int day = 0; day < 5; day++) {
                String subjectCode = " ---- ";
                if (subjects[day][hour] != null)
                    subjectCode = " " + subjects[day][hour].showCode() + " ";
                schedule += subjectCode;
            }
            schedule += "\n";
        }
        return schedule;
    }    

    public static void main(String[] args) {
        
        Schedule schedule = new Schedule();
    
        Subject asignatura = new Subject("Progamacion 1", "Prg1",0);
        schedule.addSubject(asignatura, 1, 1);
        schedule.addSubject(asignatura, 1, 2);
    
        asignatura = new Subject("Matemática 1", "mat1", 6);
        schedule.addSubject(asignatura, 1, 3);
        schedule.addSubject(asignatura, 1, 4);
    
        asignatura = new Subject("Proyectos");
        schedule.addSubject(asignatura, 4, 2);
    
        System.out.println(schedule.show());

    }    
}
