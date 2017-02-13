import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BusRoutesData {

    public boolean fetchBusRoutes(int departure, int arrival) throws IOException {
        BusRoutesFileReader busRoutesFileReader = new BusRoutesFileReader();
        List<List<Integer>> routeList = new ArrayList<List<Integer>>();

        routeList = busRoutesFileReader.routes();
        for (List<Integer> arr : routeList ){
            if(arr.contains(departure) && arr.contains(arrival)){
                return true;
            }
        }
     return false;
    }
}
