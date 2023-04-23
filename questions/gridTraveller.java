package questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class gridTraveller {

    static HashMap<List<Integer>,Integer>map=new HashMap<>();

    public static void main(String[] args) {
        System.out.println(grid(2,3));
    }
    public static int grid(int m,int n){
        if(n==1&&m==1){
            return 1;
        }
        if(n<1||m<1){
            return 0;
        }
        List<Integer>key=Arrays.asList(m,n);
        if (map.containsKey(key)) {
            map.get(key);
        }
        int result=grid(m-1,n)+grid(m,n-1);
        map.put(key,result);

        return result;

    }
}
