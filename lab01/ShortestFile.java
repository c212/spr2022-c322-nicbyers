import java.io.IOException;

public class ShortestTime {
  public static void main (String args[]) throws IOException, InterruptedException{
    long count = 0;
    System.out.println("Press CONTROL + Z to end timer.\nPess ENTER to start");
    System.in.read();
    while(true){
      System.out.println(count);
      Thread.sleep(1000);
      count++;
    }
  }
}
