/**
 * Created by john on 10/8/2014.
 */
public class EventManager {

    public Event[] events;
    public EventManager()
    {
        this.events = new Event[6];
        this.events[0] = new CanJamEvent();
        this.events[1] = new CornHoleEvent();
        this.events[2] = new HorseShoesEvent();
        this.events[3] = new LadderBallEvent();
        this.events[4] = new StickGameEvent();
        this.events[5] = new WashoosEvent();
    }
    public Event[] getEvents(){
        return events;
    }
}
