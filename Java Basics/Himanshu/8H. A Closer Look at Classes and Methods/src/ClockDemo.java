class Clock{
    private int hours, minutes, seconds;

    public Clock(){
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int sec){
        hours = Math.floorDiv(sec,3600);
        minutes = Math.floorDiv((sec % 3600), 60);
        seconds = (sec % 3600)%60;
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

    public void setClock(int sec){
        hours = Math.floorDiv(sec,3600);
        minutes = Math.floorDiv((sec % 3600), 60);
        seconds = (sec % 3600)%60;
    }

    public void tick(){
        seconds += 1;
        if (seconds == 60){
            minutes += 1;
            seconds = 0;
            if  (minutes == 60){
                hours += 1;
                minutes = 0;
                if (hours >= 24){
                    hours -= 24;
                }
            }
        }
    }

    public void addClock(Clock clock){
        clock = new Clock();
        hours  = clock.getHours() + hours;
        minutes = clock.getMinutes() + minutes;
        seconds = clock.getSeconds() + seconds;
        if (seconds == 60){
            minutes += 1;
            seconds = 0;
        }
        if (minutes >= 60){
            minutes -= 60;
            hours += 1;
        }
        if (hours >= 24){
            hours -= 24;
        }
    }

    public void tickDown(){
        seconds -= 1;
        if (seconds < 0){
            minutes -= 1;
            seconds = 60 + seconds;
            if (minutes < 0){
                hours -= 1;
                minutes = 60 + minutes;
                if (hours < 0){
                    hours = 24 + hours;
                }
            }
        }
    }

    public void subtractClock(Clock clock){
        clock = new Clock();
        hours  = clock.getHours() - hours;
        minutes = clock.getMinutes() - minutes;
        seconds = clock.getSeconds() - seconds;
        if (seconds < 0){
            minutes -= 1;
            seconds = 60 + seconds;
        }
        if (minutes < 0){
            minutes = 60 + minutes;
            hours -= 1;
        }
        if (hours < 0){
            hours = 24 + hours;
        }
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}


public class ClockDemo {
    public static void main(String[] args) {
        Clock firstClock = new Clock(4256);
        System.out.println("For First Clock -->");
        System.out.println("Original : "+firstClock);
        for (int i = 1; i<=10; i++){
            firstClock.tick();
            System.out.println("fake " + i + " : " +firstClock);
        }
        Clock secondClock = new Clock(22, 59,59);
        System.out.println("For Second Clock -->");
        System.out.println("Original : "+secondClock);
        for (int i = 1; i<=10; i++){
            secondClock.tick();
            System.out.println("fake " + i + " : " +secondClock);
        }
        firstClock.addClock(secondClock);
        System.out.println("After Adding : " + firstClock);
        firstClock.subtractClock(secondClock);
        System.out.println("After Subtracting : " + firstClock);
    }
}
