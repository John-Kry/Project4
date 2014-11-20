import java.util.ArrayList;

/**
 * Created by john on 11/20/2014.
 */
public class CompetitionManager {
    public Competition next;
    public Competition prev;
    private Competition tail;
    private Competition head;
    private Competition currItem = null;
    //starts competition
    public void StartCompetition(Event event, Team homeTeam, Team awayTeam){
        Competition newCompetition = new Competition(event, homeTeam, awayTeam);
        if (tail ==null){
            head = newCompetition;
            tail = newCompetition;
        }else{
            newCompetition.prev = tail;
            tail.next = newCompetition;
            tail = newCompetition;
        }
    }
    //ends competition
    public void EndCompetition(Competition competition, Team winningTeam){
            Competition currItem = competition;
            Competition prevItem = currItem.prev;
            Competition nextItem = currItem.next;

            prevItem.next = nextItem;
            nextItem.prev = prevItem;

    }
    //returns array of competitions
    public ICompetition[] GetCompetitions(){
        ArrayList array = new ArrayList();
        for (Competition currItem=head; currItem!=null; currItem = currItem.next){
            array.add(currItem);
        }
        return (ICompetition[]) array.toArray();
    }
}
