import java.util.ArrayList;

public class Range {

    private final char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    private ArrayList<Character> range = new ArrayList<Character>(); // range for this object

    public Range(char start, char stop){
        int startIndex = new String(alphabet).indexOf(start);
        int stopIndex = new String(alphabet).indexOf(stop) + 1;
        for (int i = startIndex; i < stopIndex; i++) {
            //System.out.println(alphabet[i]);
            range.add(alphabet[i]);
          }  
    }
    ArrayList<Character> getArrayList(){
        return range;
    }
}
