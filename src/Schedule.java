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
}
