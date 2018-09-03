import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) throws Exception{
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"123456");
        map.put(2,null);
        System.out.println(map.get(2));



        ArrayList<String> arr = new ArrayList<String>(2);
        arr.add("첫번째");

        System.out.println(arr.get(0));
        System.out.println((arr.get(1)==null)?1:2);


        String[] arr1 = new String[2];
        arr1[0]="첫번째";

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
    }
}
