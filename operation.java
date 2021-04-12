import java.util.ArrayList;
import java.util.HashMap;

public class operation {
    
    public static void main(String[] args) {
        lic licObject = new lic();
        branches.put("name", "Nashik");
        branches.put("code", "123");
        branches.put("list", "AgentList");
        HashMap<String,Object> pk = new HashMap<>();
        pk.put("AgentName", "pk");
        pk.put("Agentcode", 10);
        HashMap<String,Object> vk = new HashMap<>();
        vk.put("AgentName", "vk");
        vk.put("AgentCode", 11);
        ArrayList<HashMap<String,Object>> AgentList=new ArrayList<>();
        licObject.AddAgent(pk);
        AgentList.add(vk);
        HashMap<String,Object>saurabh = new linkedHashMap<>();
        saurabh.put("AgentName", "Saurabh");
        saurabh.put("AgentCode", 12);
        ArrayList<HashMap<String,Object>>AgentList1 = new ArrayList<>();
        AgentList1.add(saurabh); 
        HashMap<String,Object> branch = new HashMap<>();
        branch.put("agents", AgentList);
        branch.put("branchCode", 123);
        branch.put("branchName", "Nashik");
        HashMap<String,Object> branch1 = new HashMap<>();
        branch1.put("agents", AgentList1);
        branch1.put("branchCode", 124);
        branch1.put("branchName", "pune");
        ArrayList<HashMap<String, Object>> branches = new ArrayList<>();
        branches.add(branch);
        branches.add(branch1);
        HashMap<String,Object> LicInfo = new HashMap<>();
        LicInfo.put("branches" , branches);
       System.out.println(LicInfo);
        licObject.AddBranch(branch);
        licObject.AddAgent(saurabh);
       licObject.AddList(AgentList);
       System.out.println(licObject.lici);
        System.out.println(licObject.FullList());
       licObject.AddAgent(123);
        System.out.println(licObject.AddAgent(123));
        System.out.println(list.get(1));
         HashMap<String,Object> pk = new HashMap<>();
         pk.put("name", "bharat");
         pk.put("code", "1234");
         branches1.put("code", list); 
         licObject.AddBranch(branches);
         licObject.AddBranch(pk);
        System.out.println(list);
        System.out.println(licObject.GetAllList());
        Object codes = licObject.printBranch("1234");
                    
        System.out.println(codes);
       
       System.out.println(licObject.printBranch("123"));
       if(licObject.printBranch("1234") == "bharat"){
        System.out.println("bharat Kalantri");
    }
    }

}