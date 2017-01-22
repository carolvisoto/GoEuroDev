import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BusRoutesDataTest {

    @Test
    public void shouldReturnTrueIfFindTheDirectRoute (){
        int arrival = 5;
        int departure = 10;
        BusRoutesData busRouteData = new BusRoutesData();
        assertThat(busRouteData.fetchBusRoutes(departure, arrival), equalTo(true));

    }

    @Test
    public void shouldReturnFalseIfNotFindTheDirectRoute (){
        int arrival = 0;
        int departure = 5;
        BusRoutesData busRouteData = new BusRoutesData();
        assertThat(busRouteData.fetchBusRoutes(departure, arrival), equalTo(false));
    }
}
