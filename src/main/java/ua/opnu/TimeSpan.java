package ua.opnu;


public class TimeSpan {

    private int hours;
    private int minutes;

    TimeSpan (int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }

    }

    int getHours() {
        return this.hours;
    }

    int getMinutes() {
        return this.minutes;
    }

    void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            return;
        }
        int totalCurrentMinutes = this.hours * 60 + this.minutes;
        int totalAddedMinutes = hours * 60 + minutes;
        int newTotalMinutes = totalCurrentMinutes + totalAddedMinutes;

        this.hours = newTotalMinutes / 60;
        this.minutes = newTotalMinutes % 60;
    }

    void addTimeSpan(TimeSpan timespan) {
        this.add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return  this.hours + (this.minutes / 60.0);
    }

    int getTotalMinutes() {
        return this.hours * 60 + this.minutes;
    }

    void subtract(TimeSpan span) {
        int currentTotalMinutes = this.getTotalMinutes();
        int spanTotalMinutes = span.getTotalMinutes();

        if (currentTotalMinutes >= spanTotalMinutes) {
            int newTotalMinutes = currentTotalMinutes - spanTotalMinutes;
            this.hours = newTotalMinutes / 60;
            this.minutes = newTotalMinutes % 60;
        }
    }

    public void scale(int factor) {
        if (factor > 0) {
            int totalMinutes = this.getTotalMinutes();
            int newTotalMinutes = totalMinutes * factor;
            this.hours = newTotalMinutes / 60;
            this.minutes = newTotalMinutes % 60;
        }
    }
}