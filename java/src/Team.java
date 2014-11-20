/**
 * Created by john on 10/29/2014.
 */
public class Team {
    Olympian olympian1;
    Olympian olympian2;
    private int wins;
    public int getWins(){
        return this.wins;
    }
    public void setWins(int wins){
        this.wins = wins;
    }
    private int losses;
    public int getlosses(){
        return this.losses;
    }
    public void setLosses(int losses){
        this.losses = losses;
    }
    public Team(Olympian olymp1, Olympian olymp2)
    {
        this.olympian1 = olymp1;
        this.olympian2 = olymp2;
    }
}
