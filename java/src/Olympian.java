/**
 * Created by john on 10/7/2014.
 */
public class Olympian {
    private String name;
    public String getOlympianName(){
        return this.name;
    }

    private OlympianManager.Sex sex;
    public OlympianManager.Sex getOlympianSex(){
        return this.sex;
    }

    private int age;
    public int getOlympianAge(){
        return this.age;
    }

   public Olympian(String name, int age, OlympianManager.Sex sex){
       this.name = name;
       this.age = age;
       this.sex = sex;
   }
}
