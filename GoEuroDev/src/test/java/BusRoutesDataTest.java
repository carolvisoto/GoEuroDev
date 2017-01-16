import org.junit.Test;

public class BusRoutesDataTest {

    @Test
    public void shouldFindTheDirectRoute (){
        int array1[] = {1,4,7};
        int array2[] = {10,5,2};
        int array3[] = {9,6,8};

        int[][] arrays = { array1, array2, array3 };
        int arrivel = 7;
        int departure = 1;
        for (int r=0; r < arrays.length; r++) {
            for (int c=0; c < arrays[r].length; c++) {
                //TODO how to see if the values belongs to the same line?
            }
        }

    }
}
