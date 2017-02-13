import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BusRoutesFileReader {

    public  List<List<Integer>> routes() throws IOException {
        ArrayList<List<Integer>> routes = new ArrayList<>();
        File file = new File("busroutes.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            Integer numberOfLines = Integer.parseInt(br.readLine());
            for (int i = 0; i < numberOfLines; i++) {
                String line = br.readLine();
                List<String> splittedLine = Arrays.asList(line.split(" "));
                List<String> witoutFirstElement = splittedLine.subList(1, splittedLine.size());
                List<Integer> listOfIntegers = witoutFirstElement.stream().map(j -> Integer.parseInt(j)).collect(Collectors.toList());
                routes.add(listOfIntegers);
            }
        }
        return routes;
    }
}
