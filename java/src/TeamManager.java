
import java.util.Random;
public class TeamManager {
    public Team[] teams;

    public TeamManager(String[] args)
    {
        OlympianManager om = new OlympianManager(args);
        this.teams = new Team[8];
        this.teams[0] = new Team(om.Olympians[0], om.Olympians[1]);
        this.teams[1] = new Team(om.Olympians[2], om.Olympians[3]);
        this.teams[2] = new Team(om.Olympians[4], om.Olympians[5]);
        this.teams[3] = new Team(om.Olympians[6], om.Olympians[7]);
        this.teams[4] = new Team(om.Olympians[8], om.Olympians[9]);
        this.teams[5] = new Team(om.Olympians[10], om.Olympians[11]);
        this.teams[6] = new Team(om.Olympians[12], om.Olympians[13]);
        this.teams[7] = new Team(om.Olympians[14], om.Olympians[15]);
    }
    public Team[] getTeams(){
        return teams;
    }
}
