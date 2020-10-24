import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CardData{
    private int IDNumber;
    private DateTime lastCheck;

    public int getID(){
        return IDNumber;
    }

    public void setID(int inputID){
        this.IDNumber = inputID;
    }

    public DateTime getLastCheck(){
        return lastCheck;
    }

    public void setLastCheck(DateTime lastCheck){
        this.lastCheck = lastCheck;
    }

    //constructors
    public cardData(int ID, DateTime lastUse){
        setID(ID);
        setLastCheck(lastUse);
    }

    //the only way I can see what my debugger doesn't like is if I have a main ignore this
    public static void main(String[] args){}
}