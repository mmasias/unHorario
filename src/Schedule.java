public class Schedule {

    private Subject[][] subjects;

    public Schedule() {
        subjects = new Subject[5][8];
    }

    public void addSubject(Subject subject, int day, int hour) {
        assert subject != null && validDateTime(day,hour);
        subjects[day - 1][hour - 1] = subject;
    }

    public boolean isFree(int day, int hour) {
        assert validDateTime(day,hour);
        return subjects[day - 1][hour - 1] == null;
    }

    public Subject pickSubject(int day, int hour){
        assert !isFree(day,hour);
        Subject subject = subjects[day - 1][hour - 1];
        subjects[day - 1][hour - 1]=null;
        return subject;
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

    public String showAddenda() {
        String schedule = "";
        for (int day = 0; day < 5; day++) {
            schedule += "DIA " + (day + 1) + "\n";
            for (int hour = 0; hour < 8; hour++) {
                if (subjects[day][hour] != null)
                    schedule += "- " + (hour + 8) + ":00 > " + subjects[day][hour].show() + "\n";
            }
        }
        return schedule;
    }    

    private boolean validDateTime(int day, int hour){
        return day > 0 && hour > 0 && day < subjects.length && hour < subjects[0].length;
    }

}
