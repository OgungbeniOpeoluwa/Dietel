package practise;

public class FibonacciSequence {
    public static int fibonanciSequenceFunction(int number){
        int start =0;
        int result =1;
        for(int count = 1; count <= number; count++){;
            int numb = start + result;
            result = start;
            start = numb;
        }
        return result;
    }

}
