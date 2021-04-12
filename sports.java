import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashMap;

public class sports {
    ArrayList<HashMap<String,String>>sportList;
    sports(){
        this.sportList = new ArrayList<HashMap<String,String>>();
    }
    public void AddSport(HashMap<String,String> AddSport){
        this.sportList.add(AddSport);
    }
    public ArrayList<HashMap<String,String>> AllSports(){
        return sportList;
    }
}