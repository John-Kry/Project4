import java.io.*;

public class Project4 {
    public static void main(String[] args){
        Project4 p = new Project4();

        //prints title
        System.out.println("Olympics Program");

        //input checker
        BufferedReader input = null;

        try{
            input = new BufferedReader(new InputStreamReader(System.in));
            String line;
            //checks input constantly for text
            while ((line = input.readLine()) != null)
            {
                if (line.equals("e") || line.equals("events"))
                {
                    p.displayEvents();
                }
                else if (line.equals("o") || line.equals("olympians")){
                    p.displayOlympians(args);
                }
                else if (line.equals("t") || line.equals("teams"))
                {
                    p.displayTeams(args);
                }
                else if (line.equals("h")|| line.equals("help"))
                {
                    p.displayhelp();
                }
                else if (line.equals("q") || line.equals("quit"))
                {
                    break;
                }
                else
                {
                    //if command is invalid print this
                    System.out.println("Invalid Command, use h for help!");
                }
            }
        }
        catch (FileNotFoundException fnfe){
            System.out.println("File Not Found");
        }
        catch (IOException ioe){
            System.out.println("Problem Reading Input");
        }
    }
    public void displayOlympians(String[] args) {
        // prints olympions one line each
        OlympianManager om = new OlympianManager(args);
        Olympian m[] = om.getOlympians();
        for (int i = 0; i < (m.length);i++){
            System.out.println("Name: " + m[i].getOlympianName() + " Age: " + m[i].getOlympianAge() + " Sex: " + m[i].getOlympianSex() );
        }


        }
    public void displayEvents(){
        // displays the events
        EventManager em = new EventManager();
        Event e[] = em.getEvents();
        System.out.println("Events:");
        for (int i = 0; i < (e.length);i++){
            System.out.println(e[i].getEventName());
            System.out.println(e[i].getExtraInfo());
        }
    }
    public void displayTeams(String[] args){
        //displays the teams
        TeamManager tm = new TeamManager(args);
        Team t[] = tm.getTeams();
        System.out.println("Teams: ");
        for (int i = 0; i < (t.length);i++){
            System.out.println(t[i].olympian1.getOlympianName()+ " And " + t[i].olympian2.getOlympianName());
        }
    }
    public void displayhelp(){
        //displays help information
        System.out.println("Help Menu");
        System.out.println("Type o or olympions for a list of the olympions");
        System.out.println("Type e or events for a list of the events");
        System.out.println("Type h or help for the help menu");
        System.out.println("Type t or teams for a list of the teams");
        System.out.println("Type q or quit to exit the program");
    }
}


