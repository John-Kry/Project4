/**
 * Created by john on 10/28/2014.
 */
public class CanJamEvent extends Event {
    private int numBeanBags =3;
    CanJamEvent(){
        setEventName("CanJamEvent");
    }

    public String getExtraInfo() {
        return "Number of Bean Bags: " + this.numBeanBags;
    }
}
