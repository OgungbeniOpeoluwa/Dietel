package Assignment;

public class NumbersInString {
  public  static int number(String [] result){
         int n = 0;
        for(int numb = 0;numb < result.length;numb++){
            String answer = result[numb];
            int numbs = answer.length();
            for(int count = 0;count<numbs;count++){
                char results = answer.charAt(count);
               switch (results){
                   case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':{
                       n++;
                       break;
                   }
               }
            }
        }
        return n;
}
}
