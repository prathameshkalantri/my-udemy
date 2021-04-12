import java.util.ArrayList;

public class name {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("pk");
        name.add("bk");
        name.add("sk");
        name.add("jk");
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i));
        }
    }
}