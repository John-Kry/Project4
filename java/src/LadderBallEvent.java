/**
 * Created by john on 10/28/2014.
 */
public class LadderBallEvent extends Event {
    private int numRungs = 4;

    LadderBallEvent(){
        setEventName("LadderBallEvent");
    }

    public String getExtraInfo() {
        return "Number of Rungs: " + this.numRungs;
    }
}
