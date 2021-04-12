import java.util.ArrayList;
import java.util.HashMap;

public class medical {
    private String id;
    private String name;
    private String quantity;
    private String AllInfo;
    ArrayList<medical> medicins;
    medical(String Id,String Name,String Quantity){
        this.id= Id;
        this.name=Name;
        this.quantity=Quantity;
        this.AllInfo=Id+" "+Name+" "+Quantity;        
        
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getQuantity(){
        return this.quantity;
    }
    // public void AddMedicine(){
    //     this.medicins;
   // }
   public String getAllInfo(){
       return this.AllInfo;
   }
   


}