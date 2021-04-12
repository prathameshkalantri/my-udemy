//import java.util.ArrayList;
import java.util.HashMap;

class sportOperation{
    public static void main(String[] args) {
        sports object = new sports();   
        HashMap<String,String> list = new HashMap<String,String>();
        list.put("Name","cricket");
        list.put("Players","11");
        object.AddSport(list);;
        System.out.println(object.AllSports());
    }
}