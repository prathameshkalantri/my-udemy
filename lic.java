import java.rmi.server.ObjID;
 import java.util.ArrayList;
 import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

 class lic{
    LinkedList<LinkedList<HashMap<String,Object>>> LIC;
        LinkedList<HashMap<String,Object>> lici;
    
    lic(){
       this.LIC = new LinkedList<>();
        this.lici=new LinkedList<HashMap<String,Object>>();
        
    }
    public void AddBranch(HashMap<String,Object>addBranch){
       
        this.lici.add(addBranch); 
    }
    
    public Object printBranch(String branchCode){

        Object codes = null;
        
        for(int i=0;i<lici.size();i++){
           System.out.println(lici.get(i).get("code"));
            if(branchCode == lici.get(i).get("code")){
                codes = lici.get(i).get("name");
            }
            if("name" == lici.get(i).get("name")){
                System.out.println("bharat Kalantri");
            }
        }
          
          return codes;
    }
    public Object AddAgent(Object branchCode){
        Object branch=null;
        for(int i=0;i<lici.size();i++){
            // if(branchCode == lici.get(i).get("branchCode")){
            // branch=lici.get(i).put("agentCode", 10);
            // }
            System.out.println(i);
        }
    
        return lici;
    }
    // public void AddList(ArrayList<HashMap<String,Object>>AddList){
    //     this.LIC.add(AddList);
   // }
    public LinkedList<HashMap<String,Object>> FullList(){
        return lici;
    }
}




// // Object branchCode = null;
//         // Object branch=null;
//         // for(int i=0;i<lici.size();i++){
//         //     if(branchCode == lici.get(i).get(branchCode)){
//         //       branch = lici.add(agentCode)  ;
//         //     }
//         // }