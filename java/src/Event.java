/**
 * Created by john on 10/8/2014.
 */
public abstract class Event {

    private String name;
    public String getEventName(){
        return name;
    }
    public void setEventName(String name){
        this.name = name;
    }

    private int playTo;
    private boolean isPlayToExact;
    private int playDistance;

    public abstract String getExtraInfo();

    public String events;

    public Event(String events)
    {
        this.events = events;
    }
    //default constructor
    public Event(){}
}
