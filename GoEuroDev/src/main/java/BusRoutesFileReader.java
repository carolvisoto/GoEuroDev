import java.io.*;

public class BusRoutesFileReader {

  public static void main(String args[]){

      try {
          File fileDir = new File("busroutes.txt");

          BufferedReader in = new BufferedReader(
                  new InputStreamReader(
                          new FileInputStream(fileDir), "UTF8"));

          String str;

          while ((str = in.readLine()) != null) {
              System.out.println(str);
          }

          in.close();
      }
      catch (IOException e)
      {
          System.out.println(e.getMessage());
      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }
  }
}
