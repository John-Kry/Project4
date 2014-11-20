/**
 * Created by john on 10/28/2014.
 */
public class WashoosEvent extends Event{
    private boolean hasAutoWinStick = true;
    private int numWashoos = 16;

    WashoosEvent(){
        setEventName("WashoosEvent");
    }


    public String getExtraInfo() {
        return "AutoWinStick: " + this.hasAutoWinStick + " Number of Washoos: " + this.numWashoos;

    }
}
