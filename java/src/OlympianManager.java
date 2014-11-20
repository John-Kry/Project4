import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

/**
 * Created by john on 10/7/2014.
 */
public class OlympianManager
{
    // initializes variables
    public Olympian[] Olympians;

    public enum Sex{MALE,FEMALE}
    // constructor
    public OlympianManager(String[] args)
    {
        //checks file for an argument
            try {
                BufferedReader argInput = new BufferedReader(new FileReader(args[0]));
                this.Olympians = new Olympian[16];
                String argLine;
                argLine = argInput.readLine();
                if (argLine.equals("LGOO")) {
                    int i = 0;
                    while (argLine != null){
                                argLine = argInput.readLine();
                                String comma = "[,]";
                                String[] attributes = argLine.split(comma);
                                Sex sex;
                                if (attributes[2].equals("M")) {
                                    sex = OlympianManager.Sex.MALE;
                                }
                                else {
                                    sex = OlympianManager.Sex.FEMALE;
                                }

                                this.Olympians[i] = new Olympian(attributes[0], Integer.parseInt(attributes[1]), sex);
                        i= i+1;
                    }
                }
                else {
                    System.out.println("Invalid file used");
                }
            }
            catch (IOException ioe) {
                System.out.println("IO Exception found!");
            }
    }
    public int getOlympiansLength(){
        return Olympians.length;
    }
    public Olympian[] getOlympians()
    {
        return Olympians;
    }
}
