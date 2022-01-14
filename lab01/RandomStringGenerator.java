import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomStringGenerator {
    private ArrayList<Range> totalRange = new ArrayList<Range>(); // ranges
    private int rangeCount = 0; // used for indexing in nextString
    public RandomStringGenerator(){}

    public void addRange(char start, char stop){
        totalRange.add(new Range(start, stop));
        rangeCount++;
    }

    public String nextString(int length){
        String result = "";
        for(int i = 0; i < length; i++){
            //int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            Range next = totalRange.get(ThreadLocalRandom.current().nextInt(0,rangeCount)); // select range
            char nextChar = next.getArrayList().get(ThreadLocalRandom.current().nextInt(0,next.getArrayList().size())); 
            // select char from that range
            result = result + nextChar; // add char to result string
        }
        return result;
    }


    public static void main (String args[]){
        RandomStringGenerator generator = new RandomStringGenerator();
        generator.addRange('a', 'z');
        generator.addRange('A', 'Z');
        String s = generator.nextString(20);
        System.out.println(s);

       
    }
}
