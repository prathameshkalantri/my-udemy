import java.util.ArrayList;
import java.util.HashMap;

public class lic1 {
    ArrayList<HashMap<String,Object>> lic;

    lic1(){
        this.lic = new ArrayList<>();

    }
    public void AddAgent(Object BranchCode, HashMap<String, Object> agentToAdd) {
       
        for(int i=0; i<lic.size();i++){
            if(BranchCode == this.lic.get(i).get("BranchCode")){
        //    branch = Agents.add(AgentCode);
           
         ((ArrayList<HashMap<String, Object>>) this.lic.get(i).get("Agents")).add(agentToAdd);
        
            }            
        }
    }

    public void RemoveAgent(Object BranchCode, Integer AgentToRemove){
        for(int i=0; i< lic.size();i++){
            if(BranchCode== lic.get(i).get("BranchCode")){
                for(int j=0; j<((ArrayList<HashMap<String,Object>>) this.lic.get(i).get("Agents")).size();j++){
                    // System.out.println(j);
                    if( AgentToRemove == j ){
                        ((ArrayList<HashMap<String, Object>>) this.lic.get(i).get("Agents")).remove(j);
                        
                    }            
                       
                }
            }
        }
    }
    public void AddBranch(HashMap<String,Object> BranchName){
        this.lic.add(BranchName);
    }
    public void RemoveBranch(HashMap<String,Object> BranchName){
        // for(int i=0; i<lic.size();i++){
        //     if(BranchCode == lic.get(i).get("BranchCode")){
        //         lic.remove(BranchCode);
        //     }
        // }
        this.lic.remove(BranchName);
        }
    public ArrayList<HashMap<String,Object>> fullList(){
        return lic;
    }
    public void AddPolicy(Object BranchCode, Object AgentCode, HashMap<String, Object> PolicyToAdd){
        for(int i=0; i<lic.size();i++){
            // System.out.println(i);
            if(BranchCode == lic.get(i).get("BranchCode")){
                // System.out.println("hello");
                Object policyList = ((ArrayList<HashMap<String, Object>>) lic.get(i).get("Agents"));
                for(int j=0; j< ((ArrayList<HashMap<String, Object>>) policyList).size(); j++) {
                    // System.out.println(j);
                    if(AgentCode == ((ArrayList<HashMap<String, Object>>) lic.get(i).get("Agents")).get(j).get("AgentCode")) {
                        // System.out.println("Hi");
                        Object AddThisPolicy = ((ArrayList<HashMap<String, Object>>) ((ArrayList<HashMap<String, Object>>) lic.get(i).get("Agents")).get(j).get("policies"));
                        ((ArrayList<HashMap<String, Object>>) AddThisPolicy).add(PolicyToAdd);

                    }
                }
            }
        }
    
    }
    public void showInfo(Integer BranchCode, Object AgentCode){
        for(int i=0; i<lic.size();i++){
            // System.out.println(i);
            int foundbranchCode =(int) lic.get(i).get("BranchCode"); 
            if(BranchCode == foundbranchCode){
                // System.out.println("hello");
                ArrayList<HashMap<String, Object>> AgentList = (ArrayList<HashMap<String, Object>>) lic.get(i).get("Agents");
                for(int j=0; j< AgentList.size(); j++) {
                    // System.out.println(j);
                    if(AgentCode == AgentList.get(j).get("AgentCode")) {
                        // System.out.println("Hi");
                        ArrayList<HashMap<String, Object>> policyList = (ArrayList<HashMap<String, Object>>) AgentList.get(j).get("policies");
                        System.out.println(policyList.size());
                    }   
                }
            }
        }
    }
    public void policyInfo(Object policyNumber){
        // Object BranchCode ,Object AgentCode ,
        for(int i=0; i<lic.size();i++){
        //     // System.out.println(i);
        //     if(BranchCode == lic.get(i).get("BranchCode")){
        //         // System.out.println("hello");
                ArrayList<HashMap<String, Object>> AgentList = (ArrayList<HashMap<String, Object>>) lic.get(i).get("Agents");
                for(int j=0; j< AgentList.size(); j++) {
        //             // System.out.println(j);
        //             if(AgentCode == AgentList.get(j).get("AgentCode")){
                        ArrayList<HashMap<String, Object>> policyList = (ArrayList<HashMap<String, Object>>) AgentList.get(j).get("policies");
                        for(int k=0; k<policyList.size(); k++){
                            if(policyNumber == policyList.get(k).get("PolicyNumber")){
                                System.out.println("policy Number is : " + policyList.get(k).get("PolicyNumber")); 
                                System.out.println("policy Name is : " + policyList.get(k).get("PolicyName"));
                                System.out.println("policy Holder is : " + policyList.get(k).get("PolicyHolder"));
                                System.out.println("policy premium is : " + policyList.get(k).get("Premium"));

                            }
                        }
                           
                    // }   
                }
            // }
        }
    }

}
// public void RemoveAgent(Object BranchCode, Object AgentToRemove){
    //     for(int i=0;i<lic.size();i++){
    //         if(BranchCode == this.lic.get(i).get("BranchCode")){
    //         //    this.lic.get(i).get("Agents");
    //             for(int j=0; j< ((ArrayList<HashMap<String, Object>>) lic.get(i).get("Agents")).size(); j++) {
    //             //   System.out.println;
    //                if(AgentToRemove == ((ArrayList<HashMap<String, Object>>) this.lic.get(i).get("Agents")).get(j).get("AgentCode")){
    //                     ((ArrayList<HashMap<String, Object>>) ((ArrayList<HashMap<String, Object>>) this.lic
    //                     .get(i).get("Agents")).get(j).get("AgentCode")).remove(j);
    //                 }
                    
    //             }
    //         }
    //     }
        
    // }
