package clock;

/**
 * Created with IntelliJ IDEA.
 * User: gradenko
 * Date: 10.7.12
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public class ClockModule {

    private int hour;
    private int minutes;
    private int seconds;

    public int getHour() {
        return hour;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int inc) {
        minutes = inc;
      }
    public void setHour(int inc) {
        hour = inc;
    }
}
