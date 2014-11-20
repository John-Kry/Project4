/**
 * Created by john on 10/28/2014.
 */
public class CornHoleEvent extends Event {
    private int frisbeeSize = 4;

    CornHoleEvent(){
        setEventName("CornHoleEvent");
    }

    public String getExtraInfo() {
        return "Frisbee Size: " + this.frisbeeSize;
    }
}
