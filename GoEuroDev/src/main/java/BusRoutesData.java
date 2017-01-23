import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BusRoutesData {



    public boolean fetchBusRoutes(int departure, int arrival) {

        List<Integer> array1 = Arrays.asList(1,4,7);
        List<Integer> array2 = Arrays.asList(10,5,2);
        List<Integer> array3 = Arrays.asList (9,6,8);


        List<List<Integer>> arrays = new ArrayList<List<Integer>>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        for (List<Integer> arr : arrays ){
            if(arr.contains(departure) && arr.contains(arrival)){
                return true;
            }
        }
     return false;
    }
}
