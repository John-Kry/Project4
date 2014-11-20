/**
 * Created by john on 11/20/2014.
 */
public class Competition implements ICompetition {
    public Competition next;
    public Competition prev;
    private Event event;
    private Team homeTeam;
    private Team awayTeam;

    public Team getHome(){
        return this.homeTeam;
    }
    public Team getAway(){
        return this.awayTeam;
    }
    public Competition(Event event, Team homeTeam, Team awayTeam){
        this.event = event;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    public Event getEvent()
    {
        return this.event;
    }
    public void setEvent(Event event)
    {
        this.event = event;
    }
    public void setHomeTeam(Team homeTeam){
        this.homeTeam = homeTeam;
    }
    public void setAwayTeam(Team awayTeam){
        this.awayTeam = awayTeam;
    }
}
