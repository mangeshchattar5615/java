import java.util.HashMap;
public class InbuiltMapUse 
{
    public static void main(String agrs [])
    {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("abc",1);
        map.put("def",3);
          
        System.out.println(map.size());


        if(map.containsKey("abc"))
        {
         System.out.println("map has abc");   
        }
        if(map.containsKey("abc1"))
        {
         System.out.println("map has abc1");   
        }

        int v=map.get("abc");
        System.out.println(v);

        int v1= 0;
        if(map.containsKey("abc1"))
        {
            v1=map.get("abc1");
        }
        System.out.println(v1);

        map.remove("abc");

        // Set<String> keys=map.keySet();
        // for(String s:keys)
        // {
        //     System.out.println(s);
        // }

    }
}
