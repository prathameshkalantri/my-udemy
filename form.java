import java.util.ArrayList;
import java.util.HashMap;

//import sun.java2d.loops.DrawGlyphListAA.General;

public class form {
    int i;
    ArrayList<HashMap<String,Object>> lic;
    form(){
        this.lic = new ArrayList<HashMap<String,Object>>();

    }
    public void AddBranch(HashMap<String,Object>AddBranch){
        this.lic.add(AddBranch);
    }
    public ArrayList<HashMap<String,Object>> AllBranches(){
        return this.lic;
    }
    public ArrayList<HashMap<String,Object>> GetBranch (HashMap<String,Object>getBranch){
        for(int i=0;i < lic.size();i++){
            if(){

            }
            
        
                System.out.println(lic.get(i));
        }
        
       return this.lic.get(index);
   }
    

}