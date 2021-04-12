import java.util.HashMap;

class LicOperations{
       public static void main(String[] args) {
           lic licObject = new lic();
           HashMap<String,Object> branch = new HashMap<String,Object>();
           branch.put("branchName", "Nashik");
           branch.put("code", "123");
           licObject.addBranch(branch);
           HashMap<String,Object> branch2 = new HashMap<String,Object>();
           branch2.put("branchName", "jalgaon");
           branch2.put("code", "456");
           licObject.addBranch(branch2);
           licObject.addBranch(branch);
           System.out.println(licObject.AllBranches());
            //  System.out.println(licObject.getBranch("123"));
        // System.out.println(branch);


       }
}