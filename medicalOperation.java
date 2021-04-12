import java.util.ArrayList;

public class medicalOperation {
    public static void main(String[] args) {
        medical mediObj = new medical("1", "pk", "10");
        System.out.println(mediObj.getQuantity());
        //  ArrayList<medical>medicins = new ArrayList<medical>();
        //  medicins.add(mediObj);
        //  System.out.println(medicins.getQuantity());
        medical mediobj1 = new medical("2", "bk", "12");
        System.out.println(mediobj1.getQuantity());
        System.out.println(mediobj1.getAllInfo());
    }
}