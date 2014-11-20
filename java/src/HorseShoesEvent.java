/**
 * Created by john on 10/28/2014.
 */
public class HorseShoesEvent extends Event {
    private int numHorseShoes = 4;

    HorseShoesEvent(){
       setEventName("HorseShoesEvent");
    }

    public String getExtraInfo() {
        return "Number of Horse Shoes: " + this.numHorseShoes;
    }
}
