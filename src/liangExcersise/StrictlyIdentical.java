package liangExcersise;

public class StrictlyIdentical {

    public static boolean isStrictlyIdentical(int[] firstList, int[] secondList) {
        int counter = 0;
        boolean result = false;
        if(firstList.length == secondList.length)
            for(int count = 0; count < firstList.length;count++){
                if(firstList[count] == secondList[count]){
                    counter++;
                }
            }
            if(counter == firstList.length){
            result = true;
            }
        return result;
    }
}
