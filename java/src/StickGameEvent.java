/**
 * Created by john on 10/28/2014.
 */
public class StickGameEvent extends Event {
    private int frisbeeSize = 4;

    StickGameEvent(){
        setEventName("StickGameEvent");
    }

    public String getExtraInfo() {
        return "Frisbee Size: " + this.frisbeeSize;
    }
}
