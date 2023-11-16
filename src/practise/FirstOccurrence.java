package practise;

public class FirstOccurrence {

    public static int firstOccurrenceFunction(String hayStack, String needle) {
        int number = 0;
        int counter = needle.length();
        for(int count = 0; count < hayStack.length();){
                if(needle.equals(hayStack.substring(count, counter))){
                    number = count;
                    break;
                }
            count += counter;
                counter += needle.length();
                if(counter > hayStack.length()){
                    number = -1;
                    break;
                }
        }
        return number;
    }
}
