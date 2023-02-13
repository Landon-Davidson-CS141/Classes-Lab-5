package cs141.landon;

public class Clock {
    private int total;
    private int hours;
    private int minutes;
    private int seconds;
    public Clock() {
        total = 12 * 3600;
        setHours(12);
        setMinutes(0);
        setSeconds(0);
    }
    public Clock(int total) {
        setClock(total);
    }
    public void setClock(int total) {
        this.total = total;
        setHours(total / 3600);
        total -= hours * 3600;
        setMinutes(total / 60);
        total -= minutes * 60;
        setSeconds(total);
    }
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        total = (hours * 3600) + (minutes * 60) + (seconds);
    }
    public void tick() {
        setClock(total + 1);
    }
    public void tickDown() {
        setClock(total - 1);
    }
    public String toPrint() {
        String time = "";
        if (hours < 10) {
            time += "0" + hours;
        } else {
            time += "" + hours;
        }
        time += ":";
        if (minutes < 10) {
            time += "0" + minutes;
        } else {
            time += "" + minutes;
        }
        time += ":";
        if (seconds < 10) {
            time += "0" + seconds;
        } else {
            time += "" + seconds;
        }
        return time;
    }
    public String addClock(Clock obj) {
        setClock(obj.total + total);
        return toPrint();
    }
    public Clock subtractClock(Clock obj) {
        return new Clock(total - obj.total);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
