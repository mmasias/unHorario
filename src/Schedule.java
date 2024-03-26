public class Schedule {

    private Subject[][] subjects;

    public Schedule() {
        subjects = new Subject[5][8];
    }

    public void addSubject(Subject subject, int day, int hour) {
        assert subject != null && day > 0 && hour > 0 && day < subjects.length && hour < subjects[0].length;
        subjects[day - 1][hour - 1] = subject;
    }

    public boolean isFree(int day, int hour) {
        assert day > 0 && hour > 0 && day < subjects.length && hour < subjects[0].length;
        return subjects[day - 1][hour - 1] == null;
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

}
